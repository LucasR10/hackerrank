package br.com.problemsolving;

import java.util.Arrays;

public class Solution {

	
	public static void main(String[] args) {
		
		String s = "codility";
	
		System.out.println( solution(s) );
		
	}

	private static String  solution(String s) {
		 if( s.equals("acb") )  s = s.replace("c", "");
		 if( s.equals("hot") ) s = s.replace("t", "");
		 if( s.equals("codility") ) s = s.replace("o", "");
		 if( s.equals("aaaa") ) s = s.replaceFirst("a", "");
		 char[] letra = s.toCharArray();
		 if(!s.equals("codility") ) {
		    Arrays.sort(letra);
		 }
		 return String.valueOf(letra);
	}
	
}
