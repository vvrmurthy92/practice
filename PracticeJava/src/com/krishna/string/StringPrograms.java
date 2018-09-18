package com.krishna.string;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StringPrograms {

	public static void main(String[] args) {
		//anagram();
		permutationsofString();

	}
	// Program to Check for 2 strings are anagram or not
	private static void anagram() {
		
		String s1="Li sTe N";
		String s2="S Il Ent";
		s1=s1.replaceAll("\\s", "");
		s2=s2.replaceAll("\\s", "");
		if(s1.length()==s2.length()){
			char[] c1=s1.toLowerCase().toCharArray();
			char[] c2=s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)){
				System.out.println("Given Stings "+s1+" and "+s2+" are Anagram.");
			}else{
				System.out.println("Given Stings "+s1+" and "+s2+" are not Anagram.");
			}
		}else{
			System.out.println("Given Stings "+s1+" and "+s2+" are not Anagram.");
		}
		
	}  
	//Program to print all permutations of a String
	private static void permutationsofString() {
		String input="ABCD";
		ArrayList<String> strList=new ArrayList<String>();
		permutationsofStringImpl("",input,strList);
		System.out.println(strList.size());
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.get(i));
		}
	}
	private static void permutationsofStringImpl(String temp, String input, ArrayList<String> strList) {
		
		if(input.length()==0){
			strList.add(temp);
		}
		for(int i=0;i<input.length();i++){
			permutationsofStringImpl(temp+input.charAt(i),input.substring(0,i)+input.substring(i+1),strList);
		}
		
	}

}
