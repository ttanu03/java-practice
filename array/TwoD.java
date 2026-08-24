package com.array;

import java.util.Arrays;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] a = { { 5, 2, 9 }, { 4, 6, 8 }, };

		  for (int i = 0; i < a.length; ++i) {

		   for (int j = 0; j < a[i].length; ++j) {

		    System.out.print(a[i][j] + " ");

		   }
		   System.out.println("\n");
	}
		  System.out.println("Another way to print 2D arrays");

		  System.out.println(Arrays.deepToString(a));
	}
}
