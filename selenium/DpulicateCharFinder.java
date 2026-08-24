package com.selenium;

import java.util.HashMap;
import java.util.Map;

public class DpulicateCharFinder {

	public static void main(String[] args) {
		String str="TAAAAAAAAANNNNNNNUUUUU";
		// TODO Auto-generated method stub
		Map<Character,Integer> mp= new HashMap<Character,Integer>();
		
		char[] charArray= str.toCharArray();
		
		for(Character ch:charArray) {
		if(mp.containsKey(ch)) {
			mp.put(ch, mp.get(ch)+1);
		}
		else {
			mp.put(ch, 1);
		}
		}
		for(char ch:mp.keySet()) {
			if(mp.get(ch)>1) {
				System.out.println(ch  + " is "+ mp.get(ch) +" times ");
			}
		
			
		}
	}
}


