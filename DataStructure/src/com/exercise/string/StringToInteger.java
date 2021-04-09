package com.exercise.string;

public class StringToInteger {

	public static void main(String[] args) {

		//String s="   -42";
		String s="4193 with words";
		//String s="words and 987";
		System.out.println(atoi(s));
		System.out.println(atoiNew(s));

	}

	private static int atoi(String s) {
		int result=0;
		boolean negative=false;
				if(s!=null)
				{	s=s.trim();
				s=s.replace("//s", "");
				System.out.println("value:"+s);
				
				if(s.charAt(0)=='-' && !Character.isAlphabetic(s.charAt(0)))
				{
					negative =true;
					for(int i=1;i<s.length();i++)
					{
						if(Character.isDigit(s.charAt(i))) {
						result=result*10+s.charAt(i)-'0';
						}
						else
						{
							break;
						}
					}
				}
				
				else if(Character.isDigit(s.charAt(0)))
				{
					  // Iterate through all characters
			        // of input string and update result
			        // take ASCII character of corrosponding digit and
			        // subtract the code from '0' to get numerical
			        // value and multiply res by 10 to shuffle
			        // digits left to update running total
					for(int i=0;i<s.length();i++)
					{
						if(Character.isDigit(s.charAt(i))) {
						result=result*10+s.charAt(i)-'0';
						}
						else
						{
							break;
						}
					}
				}
				else if(Character.isAlphabetic(s.charAt(0)))
				{
					result=0;
				}
				}
				return negative==true?result*-1:result;
	}

	private static int atoiNew(String s) {
		int result=0;
		boolean negative=false;
		
				if(s!=null)
				{	s=s.trim();
				s=s.replace("//s", "");
				negative =s.charAt(0)=='-'?true:false;
				
				if(negative)
				{
					s=s.substring(1,s.length());
				}
				System.out.println("value:"+s);
			
				 if(Character.isDigit(s.charAt(0)))
				{
					  // Iterate through all characters
			        // of input string and update result
			        // take ASCII character of corrosponding digit and
			        // subtract the code from '0' to get numerical
			        // value and multiply res by 10 to shuffle
			        // digits left to update running total
					for(int i=0;i<s.length();i++)
					{
						if(Character.isDigit(s.charAt(i))) {
						result=result*10+s.charAt(i)-'0';
						}
						else
						{
							break;
						}
					}
				}
				else if(Character.isAlphabetic(s.charAt(0)))
				{
					result=0;
				}
				}
				return negative==true?result*-1:result;
	}

}
