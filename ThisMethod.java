//Write java program to invoke current class method using this keyword
package ANP_D0453;

public class ThisMethod 
{

	void game()
	{
		System.out.println("I am playing game");
	}
	void show()
	{
		// Explicitly use 'this' to call the game() method
		this.game();//implicit call
		System.out.println("I am show my game");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ThisMethod obj=new ThisMethod();
		obj.show();
	}
}

/* Output:I am playing game
I am show my game */
