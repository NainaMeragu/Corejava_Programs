/*1.Write a Java program to sort in ascending order an array 
of given integers[45,35,56,67,78,89,78,12,20]*/
package ANP_D0453;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array of integers to be sorted
        int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

        // Sort the array in ascending order using built-in library function
        java.util.Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
	}
}

/*Output:Sorted Array in Ascending Order:
12 20 35 45 56 67 78 78 89 */