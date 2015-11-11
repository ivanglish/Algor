package com.threads.techTalk.phaseOne.helpers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class TextReader implements Callable<List<String>>{
	
	List<String> list = new ArrayList<String>();
	
	public List<String> call(){
		
		try {
			for (String line : Files.readAllLines(Paths.get("C:/Users/ibustamante/Dropbox/Algor/src/com/threads/techTalk/phaseOne/input/texto.txt"), StandardCharsets.US_ASCII)) {
			    System.out.println(line);
			    list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
