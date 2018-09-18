package com.kalyan;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	static Set<String> hashSet = new HashSet<String>();
    public static void main(String[] args) 
    { 
    	
    	String str = "ABC"; 
        int n = str.length(); 
        StringPermutation permutation = new StringPermutation(); 
        permutation.permute(str, 0, n-1); 
        System.out.println(hashSet);
        
    } 
  
    private void permute(String str, int l, int r) 
    { 
        if (l == r) {
        	hashSet.add(str);
//            System.out.println(hashSet);
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                permute(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 
  
    public String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 
  }
