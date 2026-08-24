package com.string;

public class OccurenceOfSubString {

	public static void main(String[] args) {
	String str="hellodelfhniopqwehello";
	String find="hello";
	int idx=0;
	int count=0;
	
	while((idx=str.indexOf(find,idx)) != -1) {
		System.out.println("found at this index"+idx);
		idx++;
		count++;
	}
	System.out.println(count);

	}

}
