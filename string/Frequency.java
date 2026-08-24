package com.string;

import java.util.HashMap;
import java.util.Set;

public class Frequency {


		 public static void main(String[] args) {

		  String str = "SELENIUMJAVA";

		  HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

		  // Converting given string to char array

		  char[] strArray = str.toCharArray();

		  // checking each char of strArray

		  for (char c : strArray) {

		   if (mp.containsKey(c)) {

		    // If char is present in charCountMap, incrementing it's count by 1

		    mp.put(c, mp.get(c) + 1);

		   } else {

		    // If char is not present in charCountMap,

		    // putting this char to charCountMap with 1 as it's value

		    mp.put(c, 1);

		   }

		  }

		  // Getting a Set containing all keys of charCountMap

		  Set<Character> charsInString =mp.keySet();

		  System.out.println("Duplicate Characters In " + str);

		  // Iterating through Set 'charsInString'

		  for (Character ch : charsInString) {

		   if (mp.get(ch) > 1) {

		    // If any char has a count of more than 1, printing it's count

		    System.out.println(ch + " : " + mp.get(ch));

		   }

		  }

		 }

		
}
