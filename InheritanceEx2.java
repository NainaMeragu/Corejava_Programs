/*Create a parent class called "Vehicle" with attributes such as 
brand, model, year, and a method called "drive". 
Create a child class called "Car" that inherits from Vehicle 
and has an additional attribute called "color" 
and a method called "honk". 
Create an object of the Car class 
and call both the "drive" and "honk" methods.
*/
package ANP_D0453;
//Parent class
class Vehicle
{
	//Attribute
	String brand;
	String model;
	int year;
	
	//Method
	void drive()
	{
		System.out.println("Driving the Vehicle...");
	}
}
//Child class
class Car extends Vehicle
{
	//Additional attribute
	String color;
	
	//Method
	void honk()
	{
		System.out.println("honk honk!...");
	}
}
//Main Method
public class InheritanceEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		// calling drive method
		c.drive();
		// calling honk method
		c.honk();
		
		c.brand="Toyata";
		c.model="Activa";
		c.year=2025;
		c.color="Blue";
		
		System.out.println("Brand : "+c.brand);
		System.out.println("Model : "+c.model);
		System.out.println("Year : "+c.year);
		System.out.println("Color : "+c.color);
	}
}

/*Output:Driving the Vehicle...
honk honk!...
Brand : Toyata
Model : Activa
Year : 2025
Color : Blue */
