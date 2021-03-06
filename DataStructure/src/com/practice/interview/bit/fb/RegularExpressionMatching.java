package com.practice.interview.bit.fb;

public class RegularExpressionMatching {
	/*

	https://www.programcreek.com/2012/12/leetcode-regular-expression-matching-in-java/
	 */ public static void main(String[] args) {
		String str = "baaabab";
		String pattern = "*****ba*****ab";
		System.out.println(isMatch(str, pattern));
	}

	  public static boolean isMatch(String s, String p) {
		  
	        if(p.length() == 0)
	            return s.length() == 0;
	 
	        //p's length 1 is special case    
	        if(p.length() == 1 || p.charAt(1) != '*'){
	            if(s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
	                return false;
	            return isMatch(s.substring(1), p.substring(1));    
	 
	        }else{
	            int len = s.length();
	 
	            int i = -1; 
	            while(i<len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))){
	                if(isMatch(s.substring(i+1), p.substring(2)))
	                    return true;
	                i++;
	            }
	            return false;
	        } 
	    }

}
