package com.number;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int c=0,temp;  

	    int n=153;//It is the number to check armstrong  

	    temp=n;  

	    while(n>0)  

	    {  

	    int ld=n%10;  

	    n=n/10;  

	    c=c+(ld*ld*ld);  

	    }  

	    if(temp==c)  

	    System.out.println("armstrong number");   

	    else  

	        System.out.println("Not armstrong number");   

	   }  

	

	}



