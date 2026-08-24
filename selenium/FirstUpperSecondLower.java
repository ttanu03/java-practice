package com.selenium;

import java.util.Scanner;

public class FirstUpperSecondLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.next();
String word="";
 for(int i=0;i<str.length();i++) {
	  char ch = str.charAt(i); 
	 if(i%2==0) {
		    ch = Character.toUpperCase(ch);
		    word=word+ch;
	 }
	 ch=Character.toLowerCase(ch);
	 word=word+ch;
 }
 System.out.println(word);
	}

}
