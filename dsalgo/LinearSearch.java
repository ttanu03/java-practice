package com.dsalgo;

public class LinearSearch {
	public static int linearSearch(int[]arr,int target) {
		int n=arr.length;
		int idx=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==target) {
				idx=i;
			}
		}
		return idx;
	}
	
	 public static void main(String a[]){   

	        int[] a1= {10,20,30,50,70,90};   

	        int key = 50;   

	        System.out.println(key+" is found at index: "+linearSearch(a1, key));   

	    }   

}
