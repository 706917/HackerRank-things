/*
 * You are given two strings pattern and s. The first string pattern contains only the symbols 0 and 1, and the second string s contains only lowercase English letters.

Let's say that pattern matches a substring s[l..r] of s if the following 3 conditions are met:

they have equal length;
for each 0 in pattern the corresponding letter in the substring is a vowel;
for each 1 in pattern the corresponding letter is a consonant.
Your task is to calculate the number of substrings of s that match pattern.

Note: In this task we define the vowels as 'a', 'e', 'i', 'o', 'u', and 'y'. All other letters are consonants.

Example

For pattern = "010" and s = "amazing", the output should be binaryPatternMatching(pattern, s) = 2.
 */


package binaryPatternMatching;

public class Solution {
	
	public static void main(String[] args) {
		
		String pattern = "010";
		
		String s = "amazini";
		
		System.out.println( match(pattern, s) );
	}
	
	private static int match (String pattern, String s) {
		
		int result = 0;
		
		String vowels = "aeiouy";
		
		
		for (int i = 0; i<=s.length() - pattern.length(); i++) {
			boolean flag = true;
			
			patloop:				
				for (int j = 0; j<pattern.length(); j++) {
					if((vowels.contains(""+s.charAt(i+j)) && pattern.charAt(j) !='0') || 
						(!vowels.contains(""+s.charAt(i+j)) && pattern.charAt(j) =='0') ) {
						flag = false;
						break patloop;
					}
			}

			if(flag) result++;
		}
		
		return result;
	}

}
