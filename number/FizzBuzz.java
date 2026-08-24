package com.number;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		for(int i=1;i<=n;i++) {
			if(i%15==0) {
				   System.out.print("FizzBuzz "+i);  
			}
			else if(i%5==0) {
				System.out.println("Buzz " +i );
			}
			else {
				if(i%3==0) {
					System.out.println("Fizz "+i);
				}
				
			}
		}

	}

}
