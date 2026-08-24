package com.number;

public class CountOfZeroAndOne {
	

	    public static void main(String[] args) {

	        long num = 10011101101L;

	        int zero = 0;
	        int one = 0;

	        while (num > 0) {

	            long digit = num % 10;

	            if (digit == 0) {
	                zero++;
	            } else if (digit == 1) {
	                one++;
	            }

	            num = num / 10;
	        }

	        System.out.println("Frequency of 0 = " + zero);
	        System.out.println("Frequency of 1 = " + one);
	    }
	}


