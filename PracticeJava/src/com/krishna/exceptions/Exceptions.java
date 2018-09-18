package com.krishna.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String []args){
		arthematic();
		filenotfound();
		arrayindexoutofbound();
		nullpiointerexception();
		customexception();
		
	}

	private static void arthematic() {
		int a=2,b=0,c;
		try{
			c=a/b;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception is caught");
		}
		
		
	}

	private static void filenotfound() {
		File file=new File("D:\\Folder\\");
		try {
			FileReader fileReader=new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Exception is caught");
		}
		
	}

	private static void arrayindexoutofbound() {
		int[] a=new int[5];
		int c;
		try{
			c=a[6];
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds Exception is thrown");
		}
		
	}

	private static void nullpiointerexception() {
		String str=null;
		try{
			str.length();
		}catch(NullPointerException e){
			System.out.println("NullPointer Exception is thrown");
		}
		
	}

	private static void customexception() {
		try{
			throw new CustomException("Krishna's Exception is thrown");
		}catch(CustomException e){
			e.getMessage();
			System.out.println(e.getMessage());
		}
		
	}
	
}
