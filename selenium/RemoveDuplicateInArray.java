package com.selenium;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr = {"red", "blue", "green", "red", "yellow", "green"};
        Set<String> set= new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);
	}

}
