// Write  a java program for Autoboxing.(All Primitive Types)
package ANP_D0453;

public class AutoboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Autoboxing: Converting primitive types to their corresponding wrapper classes

		        // Integer
		        int intValue = 10;
		        Integer i= intValue; // Autoboxing: int to Integer
		        System.out.println("Autoboxing Example:");
		        System.out.println("Integer: " + i); 

		        // Double
		        double doubleValue = 3.14;
		        Double d= doubleValue; // Autoboxing: double to Double
		        System.out.println("Double: " + d);

		        // Character
		        char charValue = 'A';
		        Character c = charValue; // Autoboxing: char to Character
		        System.out.println("Character: " + c);

		        // Boolean
		        boolean booleanValue = true;
		        Boolean b= booleanValue; // Autoboxing: boolean to Boolean
		        System.out.println("Boolean: " + b);

		        // Byte
		        byte byteValue = 100;
		        Byte by= byteValue; // Autoboxing: byte to Byte
		        System.out.println("Byte: " + by);

		        // Short
		        short shortValue = 1234;
		        Short s= shortValue; // Autoboxing: short to Short
		        System.out.println("Short: " + s);

		        // Long
		        long longValue = 99999999;
		        Long l= longValue; // Autoboxing: long to Long
		        System.out.println("Long: " + l);

		        // Float
		        float floatValue = 3.14f;
		        Float f= floatValue; // Autoboxing: float to Float
		        System.out.println("Float: " + f);
	}
}
/* Output: Autoboxing Example:
Integer: 10
Double: 3.14
Character: A
Boolean: true
Byte: 100
Short: 1234
Long: 99999999
Float: 3.14 */