package com.string;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Better butter";
		str=str.replace(" ","");
		HashMap<Character,Integer>mp= new HashMap<>();
	for(char ch:str.toCharArray()) {
		mp.put(ch,mp.getOrDefault(ch,0)+1);
		
	}
	  System.out.println("Duplicate characters and their count:");
	  for(Map.Entry<Character,Integer>entry :mp.entrySet()) {
		  if (entry.getValue() > 1) {
              System.out.println(entry.getKey() + " : " + entry.getValue());
	  }
	}
	}
}

