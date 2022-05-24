/* Write an algorithm to create a class ConstructorDemo with default and parameterized constructors. Introduce yourself in both default and parameterized constructors and execute them
 * Algorithm
 * 1. Start
 * 2. create a class Constructor with Default and Parameterized constructor.
 * 3. In each constructors declare name, address, age data members.
 *  4. Create objects of two constructors in main method.
 *  5. Call methods using objects in main method to introduce yourself.
 */

class Constructor
{
	String name;
	String Address;
	int age;
	//Default Constructor
	Constructor()
	{
		name="Jayshri Kulkarni";
		Address="Laxmi Garden,Pune";
		age=40;
		
			
	}
	//parameterized Constructor
	Constructor(String abc,String res, int x)
	{
		name= abc;
		Address=res;
		age=x;
		
	}
	void display_record()
	{
	System.out.println("The name is: " + name);
	System.out.println("The address is: " + Address);
	System.out.println("The age is: " + age);
	
	}
}


public class Constructor1Demo {
	public static void main(String[] args) {
		Constructor p1= new Constructor();
		Constructor p2= new Constructor();
		p1.display_record();
		p2.display_record();
	}
}
		

