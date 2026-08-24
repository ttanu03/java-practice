package com.dsalgo;

public class BinarySearch {
	
	public static void binarySearch(int[]arr, int target,int start,int end) {

        int ans = -1;

		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>=target) {
				ans=mid;
				end=mid-1;
			}
			else {
                start = mid + 1;
            }
        }

        System.out.println("The index is: " + ans);
		}
	
	
	public static void main(String[] args) {
		 int[] a1= {10,20,30,50,70,90};   

	        int key = 50;   
	        int start=0;
	        int end=a1.length;

	        binarySearch(a1,key.start,end);


	}

}
