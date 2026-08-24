package com.number;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=131;
		int temp=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		if(rev==temp) {
			System.out.println("Number is palindrome ");
		}
		else {
			System.out.println("Not pallindrom");
		}
				

	}

}
