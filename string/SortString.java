package com.string;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "010201010100222112";
		
		///convert this string into character array
		
		char[] charArray= str.toCharArray();
		Arrays.sort(charArray);
		 String s1=String.valueOf(charArray);
		 System.out.println("After sorting " + s1);
		
		
	}

}
