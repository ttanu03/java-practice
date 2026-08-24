package com.array;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,6,1};
int start=0;
int end=arr.length-1;
while(start<=end) {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
	
}
for(int val:arr) {
	System.out.print(val+" ");
}
	}

}
