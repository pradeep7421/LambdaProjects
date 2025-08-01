package com.ps.lambda.lecture3.StreamPractice;

import java.util.ArrayList;
import java.util.List;

public class ClassA {

	public static void main(String[] args) {
     String str ="Iris Software";
     String vowels = "aeiouAEIOU";
     char [] strchar = str.toCharArray();
     List<Character> al = new ArrayList<>();
     StringBuilder sb = new StringBuilder(str);
     for(char ch :strchar) {
    	if(vowels.indexOf(ch)!=-1) {
    		al.add(ch);//Iioae
    	}
     }
    int index = al.size()-1;
		
		for(int i= 0;i<str.length();i++) {
			if(vowels.indexOf(str.charAt(i)) != -1) {
				sb.setCharAt(i, al.get(index));
				index--;
			}
		}
		System.out.println(str);
		System.out.println(sb);
		
		
	}
}
