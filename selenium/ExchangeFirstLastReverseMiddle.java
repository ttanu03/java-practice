package com.selenium;

public class ExchangeFirstLastReverseMiddle {

	public static void main(String[] args) {
		
		String str="Tanu loves Java";
		// TODO Auto-generated method stub
String fst="";
int i=0;
for(i=0;i<str.length()-1;) {
	while(str.charAt(i) !=' ') {
		fst=fst+str.charAt(i);
		i++;
	}
	break;
}
String lst="";
int j=0;
for(j= str.length()-1;j>=1;) {
	while(str.charAt(j) != ' ') {
		lst=str.charAt(j)+lst;
		j--;
		
	}
	break;
}
System.out.print(lst);
for(int m=j;m>=i;m--) {
	System.out.print(str.charAt(m));
	
}
System.out.print(fst);
	}

}
