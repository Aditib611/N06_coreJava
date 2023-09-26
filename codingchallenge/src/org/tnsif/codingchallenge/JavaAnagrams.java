/*Problem

Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

Function Description
Complete the isAnagram function in the editor.

isAnagram has the following parameters:

string a : the first string
string b : the second string
Returns
boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

Input Format
The first line contains a string a.
The second line contains a string b.

Constraints
1 <= length(a), length(b) <= 50
Strings a and b consists of English alphabetic characters.
The comparison should NOT be case sensitive.
Sample Input 0
 anagram
 margana
Sample Output 0
 Anagrams*/
package org.tnsif.codingchallenge;
import java.util.*;

public class JavaAnagrams {

	 public static boolean isAnagram(String a, String b) {
	        // Convert both strings to lowercase for case-insensitive comparison
	        a = a.toLowerCase();
	        b = b.toLowerCase();

	        // Sort the characters in both strings
	        /*toCharArray() converts a string into an array of characters. eg:['h', 'e', 'l', 'l', 'o']*/
	        char[] aChars = a.toCharArray();
	        char[] bChars = b.toCharArray();
	        Arrays.sort(aChars);
	        Arrays.sort(bChars);

	        // Compare the sorted character arrays for equality
	        return Arrays.equals(aChars, bChars);
	    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
/*public class JavaAnagrams {

static boolean isAnagram(String a, String b) {
    // Complete the function
    String s1 = a;
    String s2 = b;
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    
    if(s1.length()==s2.length())

    {
        int[] arr = new int[256];
        int[] brr = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            arr[(int) s1.charAt(i)] += 1;
            brr[(int) s2.charAt(i)] += 1;
        }
        for (int i = 0; i < 256; i++) {
            if (arr[i] != brr[i])
                return false;

        }
        return true;
    }
    else
    {
        return false;
    }
}
*/