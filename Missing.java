package com.array;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 5, 4 };
		int n = arr.length + 1;

		  int sum = n * (n + 1) / 2;

		  int restSum = 0;

		  for (int i = 0; i < arr.length; i++) {

		   restSum += arr[i];

		  }

		  int missingNumber = sum - restSum;

		  System.out.print("Missing no "+missingNumber);
	}

}
