/* Write a Java program to sort in descending order an array 
of given string[A,X,D,Z,Y,C,W,B]*/
package ANP_D0453;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array of strings to be sorted
        String[] words = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

        // Sort the array in descending order using built-in library functions
        Arrays.sort(words, Collections.reverseOrder());

        // Print the sorted array
        System.out.println("Sorted Array in Descending Order:");
        for (String word : words) {
            System.out.print(word + " ");
        }
	}
}
/*Output:Sorted Array in Descending Order:
Z Y X W D C B A */