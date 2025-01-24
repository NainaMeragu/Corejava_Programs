/*Create a parent class called "Person" with attributes 
such as name, age, and a method called "speak". 
Create a child class called "Student" that inherits from Person 
and has an additional attribute called "grade" 
and a method called "study". 
Create an object of the Student class and 
call both the "speak" and "study" methods.
*/
package ANP_D0453;

//Parent class
class Person 
{
	//Attribute
	String name;
	int age;
	
	//Method
	void speak()
	{
		System.out.println("Hi! My name is Sakshi");
	}
}
//Child class
class Student extends Person
{
	//Additional attribute
	int grade=10;
	
	//Method
	void study()
	{
		System.out.println("I'm studying hard!");
	}
}
//Main class
public class InheritanceEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// object of Student class
		Student s=new Student();
		// calling speak method
		s.speak();
		// calling study method
		s.study();
		
		s.name="Sakshi";
		s.age=21;
		s.grade=10;
	
		System.out.println("\nName : "+s.name);
		System.out.println("age : "+s.age);
		System.out.println("Grade : "+s.grade);
	}
}
/*Output: Hi! My name is Sakshi
I'm studying hard! 

Name : Sakshi
age : 21
Grade : 10
*/