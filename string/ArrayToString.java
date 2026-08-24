package com.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {

	
		 public static void main(String[] args) {

		  String[] strArray = { "abc", "efg", "fgh" };

		  System.out.println(convertArrayToString(strArray));

		  System.out.println(convertArrayToStringMethod(strArray));

		  System.out.println(convertArrayToStringUsingStreamAPI(strArray));

		  System.out.println(convertArrayToStringUsingCollectors(strArray));

		  // convert string to array

		  String[] strArray1 = "javaguides".split(" ");

		 }

		 // Using Arrays.toString()

		 public static String convertArrayToString(String[] strArray) {

		  return Arrays.toString(strArray);

		 }

		 // using StringBuilder.append()

		 public static String convertArrayToStringMethod(String[] strArray) {

		  StringBuilder stringBuilder = new StringBuilder();

		  for (int i = 0; i < strArray.length; i++) {

		   stringBuilder.append(strArray[i]);

		  }

		  return stringBuilder.toString();

		 }

		 // Using Stream API

		 public static String convertArrayToStringUsingStreamAPI(String[] strArray) {

		  String joinedString = String.join(" ", strArray);

		  return joinedString;

		 }

		 // Using Stream API and Collectors

		 public static String convertArrayToStringUsingCollectors(String[] strArray) {

		  String joinedString = Arrays.stream(strArray).collect(Collectors.joining());

		  return joinedString;

		 }

		}


