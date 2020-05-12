/*
 * The problem is to write a program to check if two different strings are almost equal or not.
 * 
 * Two different strings consider almost equal if they have the same length and  for each lower-case character
 * in one string there are no more than three same characters in another string.
 * 
 * The constraints for the task are:
 * INPUT
 * - two different lists of strings comes as an input
 * - We suppose to check "almostEquality" for each pair of strings in the lists, that share the same index: List_1.get(i) and List_2.get(i)
 * - The number of strings in each list are the same
 * - Each string consist only lower-case alphabet characters
 * 
 * OUTPUT
 * - One list of strings comes as output and consist "Yes" or "No" as a result of the comparison of each pair of strings in the lists from input 
 * Meaning that if the input-lists consist of 5 strings - output list should be the size of 5 too, with the "Yes" or "No" as it's elements
 */

package almostEqualStrings;

import java.util.ArrayList;
import java.util.List;

public class AlmostEqualStrings {
	
	
	public List<String> doCheck(List<String> s, List<String> t){
		List <String> returnValue = new ArrayList<>();
		
		// The length of input list
		int n = s.size();
		
		for(int i = 0; i < n; i++) {
			
			// Boolean flag as the result of comparison
			boolean compare = true;
			
			// Check if lengths of strings are equal
			if(s.get(i).length() != t.get(i).length()) {
				compare = false;
				
			}
			if(compare) {
				// Check the difference of characters counts
				if(!countCharacters(s.get(i), t.get(i))) {
					compare = false;				
				}
			}
			
			// Add the result-String to the the returnValu list
			if(compare) returnValue.add("Yes");
			else returnValue.add("No");			
		}		
		
		return returnValue;
	}

	private static boolean countCharacters(String str1, String str2) {

		boolean flag = true;
		int n = str1.length();
		
		int [] arr = new int[26];
		
		for(int i = 0; i<n; i++) {
			
			arr[-('a'-str1.charAt(i))]+=1;
			// System.out.println(-('a'-str1.charAt(i)));
			// System.out.println();
			
			arr[-('a'-str2.charAt(i))]--;	
			//System.out.print(str2.charAt(i));
		}
		
		for(int el: arr) { if (Math.abs(el)>3) flag = false;	}		
		
		return flag;
	}

}
