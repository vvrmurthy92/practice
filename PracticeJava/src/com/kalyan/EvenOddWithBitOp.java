package com.kalyan;

public class EvenOddWithBitOp {
	
	public static void main(String[] args) {
		int num = 15;
		
		if ((num & 1) == 1)
			System.out.println("oddd");
		else
			System.out.println("Even");
	}
	
}
