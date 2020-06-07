/*
 * Given a positive integer number n, your task is to calculate the difference between the product of its digits and the sum of its digits.

Note: The order matters; the answer should be of the form product - sum (and not sum - product).

Example

For n = 123456, the output should be digitsManipulations(n) = 699.

The product of the digits is equal to 1 * 2 * 3 * 4 * 5 * 6 = 720.
The sum of the digits is equal to 1 + 2 + 3 + 4 + 5 + 6 = 21.
So the final answer is 720 - 21 = 699.

For n = 1010, the output should be digitsManipulations(n) = -2.

The multiplication of the digits is equal to 1 * 0 * 1 * 0 = 0.
The sum of the digits is equal to 1 + 0 + 1 + 0 = 2.
So the final answer is 0 - 2 = -2.
 */

package digitsManipulations;

public class Solution {

	public static void main(String[] args) {

		int n = 123456;
		
		System.out.println( answer(n) );
	}
	
	private static int answer(int n) {
		
		
		String str = "" + n;
		
		int product = 1;
		int summ = 0;
		
		for (int i = 0; i<str.length(); i++) {
			
			System.out.println(str.charAt(i) - '0');
			
			product = product * (str.charAt(i) - '0');
			summ = summ + (str.charAt(i) - '0');
		}
		return product - summ;
		
	}

}
