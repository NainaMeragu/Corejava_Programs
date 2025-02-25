//2. Write a java program for  Unboxing.(all types).
package ANP_D0453;

public class UnboxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Unboxing: Converting wrapper classes to their corresponding primitive types

		        // Integer
		        Integer integerObject = 10; 
		        int intValue = integerObject; // Unboxing: Integer to int
		        System.out.println("Unboxing Example:");	        
		        System.out.println("integer: " + intValue);

		        // Double
		        Double doubleObject = 3.14;
		        double doubleValue = doubleObject; // Unboxing: Double to double
		        System.out.println("double: " + doubleValue);

		        // Character
		        Character characterObject = 'A';
		        char charValue = characterObject; // Unboxing: Character to char
		        System.out.println("character: " + charValue);

		        // Boolean
		        Boolean booleanObject = true;
		        boolean booleanValue = booleanObject; // Unboxing: Boolean to boolean
		        System.out.println("boolean: " + booleanValue);

		        // Byte
		        Byte byteObject = 100;
		        byte byteValue = byteObject; // Unboxing: Byte to byte
		        System.out.println("byte: " + byteValue);

		        // Short
		        Short shortObject = 4321;
		        short shortValue = shortObject; // Unboxing: Short to short
		        System.out.println("short: " + shortValue);

		        // Long
		        Long longObject = 9999999L;
		        long longValue = longObject; // Unboxing: Long to long
		        System.out.println("long: " + longValue);

		        // Float
		        Float floatObject = 3.14f;
		        float floatValue = floatObject; // Unboxing: Float to float
		        System.out.println("float: " + floatValue);
     }
}
/* Output: Unboxing Example:
integer: 10
double: 3.14
character: A
boolean: true
byte: 100
short: 4321
long: 9999999
float: 3.14 */