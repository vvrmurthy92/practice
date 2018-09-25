package com.kalyan;

import java.io.File;
import java.util.Scanner;

public class Exceptionspractice {

	
	public static void main(String[] args) throws NotEqualException {
		
		arrayIndexOBE();
		fileNFE();
		userDefinedException();
		scannerTest();
		
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
