package com.array;

public class SortTheElm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,6,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int val:arr) {
			System.out.print(val+" ");
		}

	}

}
