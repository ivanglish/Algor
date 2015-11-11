package com.atlassian.me;

public interface FindCommonAncestor
{
   String findCommmonAncestor(String[] commitHashes, String[][] parentHashes, String commitHash1, String commitHash2);

}