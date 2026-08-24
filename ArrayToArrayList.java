package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		String[] array = {"a", "b", "c", "d", "e"};
		

	      List<String> list = Arrays.asList(array);          

	      System.out.println(list);
	      
		List<String> list1= new ArrayList<String>();
		Collections.addAll(list1,array);
		System.out.println(list1);
	}

}
