package com.array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{1,3,4},{2,4,3},{3,4,5}};  
		int row=arr.length;
	
		for(int i=0;i<row;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
		
		}
			System.out.println();

	}

}
}
