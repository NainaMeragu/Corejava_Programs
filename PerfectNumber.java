// Write a java program to check given number is perfect number or not
package ANP_D0453;

import java.util.Scanner;

public class PerfectNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		// Calculate the sum of divisors of the number
		int sumOfDivisors = 0;
		for (int i = 1; i < number; i++) 
		{
			if (number % i == 0) 
			{
				sumOfDivisors += i;
			}
		}

		// Check if the number is a perfect number
		if (sumOfDivisors == number) 
		{
			System.out.println(number + " is a perfect number.");
		} else 
		{
			System.out.println(number + " is not a perfect number.");
		}

		// Close the scanner to release resources
		scanner.close();
	}

}

/* Output : Enter a number: 6
6 is a perfect number.
Enter a number: 5
5 is not a perfect number.
 */