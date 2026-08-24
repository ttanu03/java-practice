package com.selenium;

public class DuplicateAdjacent {
	public static void check(String str) {
		if(str.length()<=1) {
			System.out.println(str);
			return;
		}
		String n="";
		boolean found=false;
		for(int i=0;i<str.length();i++) {
			
			if(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
				found =true;
				i++;
				//skp both he duplicate 
				
			}
			else {
				n=n+str.charAt(i);
			}
		}
		if(found) {
			check(n);
		}
		else {
			System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbaca";

        check(str);
		

		
	}

}
