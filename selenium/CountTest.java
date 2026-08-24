package com.selenium;

public class CountTest {

	public static void main(String[] args) {
		

		        String s = "test1test2test3test4";
		        String word = "test";

		        int count = 0;
		        int index = 0;

		        while ((index = s.indexOf(word, index)) != -1) {
		            count++;
		            index = index + word.length();
		        }

		        System.out.println("test is present " + count + " times");
		    }
		}


