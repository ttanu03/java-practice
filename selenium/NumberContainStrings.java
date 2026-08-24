package com.selenium;

public class NumberContainStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String sample = "BSG234JGJH";

	        char[] chars = sample.toCharArray();

	        StringBuilder sb = new StringBuilder();

	        for(char c : chars){

	           if(Character.isDigit(c)){

	              sb.append(c);

	           }

	        }

	        System.out.println("No in String is: "+sb);

	}

}
