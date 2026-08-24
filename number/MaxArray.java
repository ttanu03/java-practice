package com.number;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={ 1,2,3,4,5,65,76,5,4,33,4,34,232,3,2323};
		int max = Integer.MIN_VALUE;
		
		  for (int i = 1; i < arr.length; i++) {

			   if (arr[i] > max)

			    max = arr[i];
	}
	System.out.println(max);

}
}
