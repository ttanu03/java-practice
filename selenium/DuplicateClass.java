package com.selenium;

public class DuplicateClass {
	

	    public static void main(String[] args) {

	        String[] words = {"Java", "Selenium", "Java", "Python", "Selenium"};

	        for (int i = 0; i < words.length; i++) {

	            for (int j = i + 1; j < words.length; j++) {

	                if (words[i].equals(words[j])) {
	                    System.out.println("Duplicate word: " + words[i]);
	                }
	            }
	        }
	    }
	}

