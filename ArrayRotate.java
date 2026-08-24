package com.array;

public class ArrayRotate {

	public static void leftRotate(int[]nums,int k) {

		int n=nums.length;
		k=k%n;
		int[] temp= new int[k];
		//create a temp array to store the array elemeney
		for(int i=0;i<k;i++) {
			temp[i]=nums[i];
		}
		for(int i=k;i<n;i++) {
			nums[i-k]=nums[i];
		}
		//copy the element from temp
		for(int i=0;i<k;i++) {
			nums[n-k+i]=temp[i];
		}
		for(int val:nums) {
			System.out.print(val +" ");
		}
		System.out.println();
	}
	
	public static void rightRotate(int[]nums,int k) {
		int n=nums.length;
		k=k%n;
		int[] temp=new int[k];
		
		///store last k element
		for(int i=0;i<k;i++) {
			temp[i]=nums[n-k+i];
			}
		//shift remaining element to the right
		
		for(int i=n-1;i>=k;i--) {
			nums[i]=nums[i-k];
		}
		//put stored element at the begin
		for(int i=0;i<k;i++) {
			nums[i]=temp[i];
		}
		for(int val:nums) {
			System.out.print(val +" ");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k=3;
//		leftRotate(arr,k);
		rightRotate(arr,k);


	}

}
