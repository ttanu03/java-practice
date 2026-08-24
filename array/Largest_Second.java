package com.array;

public class Largest_Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={ 1, 22,100,67,99 };

int max = Integer.MIN_VALUE;
int secondMax = Integer.MIN_VALUE;
		int n=nums.length;
		for(int i=0;i<n;i++) {
			if(nums[i]>max ) {
				secondMax=max;
				max=nums[i];
			}
			else if (nums[i] > secondMax && nums[i] != max) {
		        secondMax = nums[i];
		    }
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		System.out.println("First max "+ max);
		System.out.println("Second max " +secondMax);

	}

}
