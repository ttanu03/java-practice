package com.selenium;

public class RemoveSpace {

	public static void main(String[] args) {
		 

		        String str = "#raj @  100#abc  @102#e  fg  @103";  

		        //1st way  

		        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  

		        System.out.println(noSpaceStr);  

		    }  

		}  


