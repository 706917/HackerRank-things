/*
 * You are given two strings pattern and s. The first string pattern contains only the symbols 0 and 1, and the second string s contains only lowercase English letters.

Let's say that pattern matches a substring s[l..r] of s if the following 3 conditions are met:

they have equal length;
for each 0 in pattern the corresponding letter in the substring is a vowel;
for each 1 in pattern the corresponding letter is a consonant.
Your task is to calculate the number of substrings of s that match pattern.

Note: In this task we define the vowels as 'a', 'e', 'i', 'o', 'u', and 'y'. All other letters are consonants.
 */


package string_match_patternString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PatternString {
	
	public static void main(String[] args) {
	
	String s = "abba";
	
	String t = "bsbss";
//	System.out.print(s.contains("" + 'a'));
	int a = '-';
	System.out.println(a);
	
	
	List <String> list = new ArrayList<>();
    list.add(s);
    list.add(t);
    Collections.sort(list);
    if(list.get(0).equals(t)) 
    	Arrays.sort(list);
    
	}
	
	
}
