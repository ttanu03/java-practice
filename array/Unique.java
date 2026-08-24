package com.array;

import java.util.HashSet;
import java.util.Set;

public class Unique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {1, 2, 3, 2, 4, 1, 5};

		Set<Integer> set = new HashSet<>();

		for (int num : arr) {
		    set.add(num);
		}

		System.out.println(set);

	}

}
