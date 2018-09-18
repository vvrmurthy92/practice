package com.kalyan;

public class StringReverse {

	static String rev = "Karthi";
	public static void main(String[] args) {
		
		char[] temp = rev.toCharArray();
		int length = temp.length;
		reverse( temp, length);
	}

	public static String reverse( char[] temp,int length) {

		if (temp[length-1] == temp[0]) {
			System.out.println(temp[length-1]);
		}
		else {
			System.out.println(temp[length-1]);
			reverse(temp, length-1);
		}
		
		return rev;
	}
}
