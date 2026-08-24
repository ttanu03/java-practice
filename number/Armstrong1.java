package com.number;

public class Armstrong1 {

	public static void main(String[] args) {
		
		        int num = 153;
		        int original = num;

		        // Count number of digits
		        int count = 0;
		        int temp = num;

		        while (temp > 0) {
		            count++;
		            temp = temp / 10;
		        }

		        // Calculate Armstrong sum
		        int sum = 0;
		        temp = num;

		        while (temp > 0) {

		            int digit = temp % 10;

		            sum = sum + (int) Math.pow(digit, count);

		            temp = temp / 10;
		        }

		        // Check
		        if (sum == original) {
		            System.out.println(original + " is an Armstrong number");
		        } else {
		            System.out.println(original + " is not an Armstrong number");
		        }
		
	}

}
