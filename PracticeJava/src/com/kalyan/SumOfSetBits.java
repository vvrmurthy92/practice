package com.kalyan;

public class SumOfSetBits {

	public static void main(String[] args) {


		int n = 11;
		int ct = 0;
		
//		for (int i = 0; i < Integer.SIZE; i++) {
//			
//			if (((n>>31-i) & 1) == 1 ) {
//				ct+=1;
//			}
//		}
		
		while(n != 0) {			
			ct+=1;
			n &=(n-1);
		}	
		System.out.println(ct);
		
	}

}
