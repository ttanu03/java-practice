package com.array;

import java.util.ArrayList;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= { 1,2,2,3,4,4,5,5,6,7};
		 ArrayList<Integer> arrlist = new ArrayList<>();

		  System.out.println("Duplicate elements in given array: ");

		  // Searches for duplicate element

		  for (int i = 0; i < arr.length; i++) {

		   for (int j = i + 1; j < arr.length; j++) {

		    if (arr[i] == arr[j]) {

		     System.out.println(arr[j]);

		     // Storing duplicate elements in an arrayList

		     arrlist.add(arr[j]);

		    }

		   }

		  }

	}

}
