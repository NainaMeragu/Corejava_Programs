// Write a program to check given number is prime number or not
package ANP_D0453;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Scanner object to read user input
		Scanner sc=new Scanner(System.in);

		//user to enter a number
		System.out.println("Enter a number:");
		int a=sc.nextInt();

		int count=0;

		//Loop through divisors from 2 to a
		for(int i=2;i<a;i++) 
		{
			// If 'a' is divisible by 'i' (i.e., no remainder)
			if(a%i==0) 

			{
				// Increment the count of divisors
				count=+1;
			}
		}
		// If count is greater than or equal to 1
		if(count>=1) 
		{
			System.out.println(a+" is not a prime no.");
		}
		else //If count is 0, it means no divisors were found
		{
			System.out.println(a+" is a prime no.");
		}
	}

}

/* Output: Enter a number:5
5 is a prime no.
Enter a number:25
25 is not a prime no.*/
