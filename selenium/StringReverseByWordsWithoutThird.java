package com.selenium;

public class StringReverseByWordsWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String s = "abc,bbc,ccd";

		        int firstComma = s.indexOf(',');
		        int secondComma = s.indexOf(',', firstComma + 1);
		        //start searchng ssecond commaa after first commoa +1
		        

		        System.out.println(
		            s.substring(secondComma + 1) + "," +
		            s.substring(firstComma + 1, secondComma) + "," +
		            s.substring(0, firstComma)
		        );
		    }
}
		


