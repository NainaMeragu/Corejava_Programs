/* Write a program using Vector to store the list of students details and print the details. */

package ANP_D0453;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		// Creating a Vector to store student details
		Vector<String> v = new Vector<String>();

		// Adding student details
		v.add("Name : Savita , Age : 21 , Branch : Computer science");
		v.add("Name : Jyoti , Age : 25 , Branch : Civil ");
		v.add("Name : Sona , Age : 23 , Branch : Electronics ");
		v.add("Name : Aishwarya , Age : 22 , Branch : Electrical ");
		v.add("Name : Tanavi , Age : 23 , Branch : Information Technology");

		// Printing student details
		System.out.println("Student Details: ");
		for(String students : v) {
			System.out.println(students);
		}
	}
}

/*
Output:
Student Details: 
Name : Savita , Age : 21 , Branch : Computer science
Name : Jyoti , Age : 25 , Branch : Civil 
Name : Sona , Age : 23 , Branch : Electronics 
Name : Aishwarya , Age : 22 , Branch : Electrical 
Name : Tanavi , Age : 23 , Branch : Information Technology
*/