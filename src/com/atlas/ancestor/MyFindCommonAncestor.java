package com.atlas.ancestor;

import java.util.HashSet;
import java.util.Set;


public class MyFindCommonAncestor implements FindCommonAncestor{
   

    @Override
    public String findCommmonAncestor(String[] commitHashes,
            String[][] parentHashes, String commitHash1, String commitHash2) {
    	
       
            boolean flag=true;
            String commonAncestor = "root";
            String nodo = branch(parentHashes);                       
            for (int i = commitHashes.length-1; i > -1 ; i--) {
               
            	//parent of the first value
                if (commitHashes[i]==commitHash1 && commonAncestor != nodo){
                    commonAncestor = parentHashes[i][0];
                    flag = false;
                    
                } 
                //new branch
                if (commitHashes[i] == nodo && flag){
                    commonAncestor = nodo;
                    flag =false;
                }   
                
                //move the commonAncestor
                if(flag){
                    commonAncestor = commitHashes[i];
                }       
            }
            return commonAncestor;
           
        }
   
    private String branch(String[][] parentHashes){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < parentHashes.length; i++) {
            if (!set.add(String.valueOf(parentHashes[i][0]))){
                return String.valueOf(parentHashes[i][0]);
            }
        }
        return null;           
    }
   
//    private Set<String> branchList(String[][] parentHashes){
//        Set<String> set = new HashSet<>();
//        Set<String> setOut = new HashSet<>();
//        for (int i = 0; i < parentHashes.length; i++) {
//            if (!set.add(String.valueOf(parentHashes[i][0]))){
//                setOut.add(String.valueOf(parentHashes[i][0]));
//            }
//        }       
//        return setOut;       
//    }
}
