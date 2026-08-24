package com.number;

public class PowerWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int base=3,pow=4;
		int result=1;
		while(pow!=0) {
			result*=base;
			pow--;
			
		}
		System.out.print(result);

	}

}
