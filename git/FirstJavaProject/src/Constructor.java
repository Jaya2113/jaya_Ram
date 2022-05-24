
/* Write a program to implement Constructor
 * 1. Create a class ConstructorDemo.
 * 2. Create a default Constructor for the class and print "I am Default COnstructor."
 * 3. Execute the Constructor created.
 * 4. Create a parameterized Constructor with arguments of type integer,float,string and character.
 * 5.Print "I am Parameterized Constructor. I take various arguments as input."
 * 6. Create Squares from integers and float values and print them in new lines.
 * 7. Print String and Character in new line
 * 8. Execute the class constructors
 */

package com.greatlearning.corejava;

public class Constructor

{int x=5;
float y=10.5f;
String name="Jayshri Kulkarni";
char z= 'j'; 
//Default Constructor
	public Constructor()
	{
		System.out.println("I am Default Constructor");
		
	}
	
	//Parameterized Constructor
	public Constructor(int x,float y, String name, char z)
		{
		System.out.println("I am Parameterized COnstructor.I take various arguments in new lines");
	
	}
	public void observations()
		{
		System.out.println("I am Parameterized COnstructor.I take various arguments in new lines");
	int result=x*x;
	float ans=y*y;
	System.out.println("The square of integers is :" +result);
	
	System.out.println("The square of float numbers is :" +ans);
	System.out.println("The name is :" +name);
	System.out.println("The character is :" +z);
	
		}
	public static void main (String args[])
	{
		Constructor p1= new Constructor();
				
		p1.observations();
		
	}
}









