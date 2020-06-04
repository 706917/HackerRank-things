/*
 * Task
Consider a database table, Emails, which has the attributes First Name and Email ID. Given  rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .

Input Format

The first line contains an integer, , total number of rows in the table.
Each of the  subsequent lines contains  space-separated strings denoting a person's first name and email ID, respectively.

Constraints

Each of the first names consists of lower case letters  only.
Each of the email IDs consists of lower case letters ,  and  only.
The length of the first name is no longer than 20.
The length of the email ID is no longer than 50.
 */
package RegexPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class RegexPattern {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String>listNames = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];

            if(emailID.contains("@gmail.com"))
            	listNames.add(firstName);
        }
               
        Collections.sort(listNames);
        
        for(String name: listNames) {
        	System.out.println(name);
        }

        scanner.close();
    }

}
