package com.interview.mock;

public class RegularExpressionMatch {

	public static void main(String[] args) {
		/*
		 * String A = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"; String B =
		 * "*b";
		 */
		String A =  "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		String B = "*b";

		System.out.println(isMatch(A, B));
	}

	public static int isMatch(final String p, final String s) {
        if(p.length() == 0)
            return 0;

       //p's length 1 is special case    
        if(p.length() == 1 || p.charAt(1) != '*'){
            if(s.length() < 1 || (p.charAt(0) != '?' && s.charAt(0) != p.charAt(0)))
                return 0;
            return isMatch(s.substring(1), p.substring(1));    

        }else{
            int len = s.length();

            int i = -1; 
            while(i<len && (i < 0 || p.charAt(0) == '?' || p.charAt(0) == s.charAt(i))){
                if(isMatch(s.substring(i+1), p.substring(2))==1)
                    return 1;
                i++;
            }
            return 0;
        } }
}
