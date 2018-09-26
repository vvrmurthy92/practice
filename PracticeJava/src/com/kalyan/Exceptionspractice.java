package com.kalyan;

import java.awt.Container;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exceptionspractice {

	
	public static void main(String[] args) throws NotEqualException {
		
		arrayIndexOBE();
		fileNFE();
//		userDefinedException();
		scannerTest();
		outOfMemory();
		
	}

	private static void outOfMemory() {
		
		Integer[] array = new Integer[10000 * 10000]; 
		System.out.println(Arrays.asList(array));
	}

	private static void scannerTest() {

		try {
//			Scanner  sc = new Scanner(System.in);
//			System.out.println("give your integer");
//			int aa = sc.nextInt();
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("Zero is invalid in deviser");
		}
	}

	private static void userDefinedException() throws NotEqualException {

		if (1!=2) {
			throw new NotEqualException();
		}
	}
	

	private static void fileNFE() {

		String path = "C:/kalyan";
		File f = new File(path);
		System.out.println(f.getPath().chars());
	}

	private static void arrayIndexOBE() throws ArrayIndexOutOfBoundsException {
		
		try {
			int[] a = {121,12};
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
		}
		
		
		// TODO Auto-generated method stub
		
	}
}
