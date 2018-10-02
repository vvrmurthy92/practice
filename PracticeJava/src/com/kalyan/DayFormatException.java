package com.kalyan;

public class DayFormatException extends Exception {

	private static final long serialVersionUID = -3972418178603137839L;

	
	public DayFormatException() {

		System.out.println("Entered day format is incorrect. \n"
				+ "1. It should contain only integers and '?' charecters \n"
				+"2. It should contain 7 charecters.");
		
	}
	
}
