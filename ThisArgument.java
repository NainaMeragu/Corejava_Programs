//Write a Java Program  to pass  this keyword as argument in the constructor call.
package ANP_D0453;

public class ThisArgument 
{

	int x; 

	// Constructor
	ThisArgument(int x) 
	{
		this.x = x; 
	}

	// Method that takes 'this' as an argument
	void display(ThisArgument obj) 
	{
		System.out.println("Value of x in the object passed: " + obj.x);
	}

	// Method to passing 'this' to another method
	void displayThis() 
	{
		display(this); 
	}

	public static void main(String[] args) 
	{
		ThisArgument obj = new ThisArgument(10); 
		obj.displayThis(); 
	}
}

/* Output: Value of x in the object passed: 10 */