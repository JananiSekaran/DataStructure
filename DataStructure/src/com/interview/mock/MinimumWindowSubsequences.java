package com.interview.mock;

public class MinimumWindowSubsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S = "abcdebdde", T = "bde";
		System.out.println(minWindow(S, T));
	}

	public static String minWindow(String S, String T) {
	    int start=0;
	    String result = "";
	 
	    while(start<S.length()){
	        int j=0;
	 
	        for(int i=start; i<S.length(); i++){
	            if(S.charAt(i)==T.charAt(j)&&j==0){
	                start=i;
	            }
	 
	            if(S.charAt(i)==T.charAt(j)){
	                j++;
	            }
	 
	            if(j==T.length()){
	                if(result.equals("")||(i-start+1)<result.length()){
	                    result = S.substring(start, i+1);
	                }
	                start=start+1;
	                break;
	            }
	 
	            if(i==S.length()-1){
	                return result;
	            }
	        }
	    }
	 
	    return result;
	}
}
