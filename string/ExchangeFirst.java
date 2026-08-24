package com.string;
import java.util.HashMap;

public class ExchangeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str="JAVASELENIUM";
        HashMap<Character,Integer> mp= new HashMap<>();
        for(char ch :str.toCharArray()){
          mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        System.out.println(mp);
  }

	}


