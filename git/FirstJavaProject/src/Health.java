/* Write an algorithm to implement access modifier functionality. Create two separate classes Health and 
 * HealthDriver inside com.greatlearning.corejava; package. Declare variables age(int),weight(float)&bmi(float)
 * inside class Health as protected. Display all the variables in class HealthDriver.
 * Algorithm:
 * 1. Start
 * 2. Create a package com.greatlearning.corejava
 * 2. Create a class Health
 * 3. Declare variables as int age, float weight and float bmi as protected in class Health
 * 4. Assign values to data members in class Health.
 * 5. Create a seconds class HealthDriver.
 * 6. Create an object obj of class Health in class HealthDriver
 * 7. Access the members from class Health using obj object in class HelathDriver 
 * 8. Display the all the variables in class HealthDriver using obj object.
 * 9.stop */
 

package com.greatlearning.corejava;

public class Health {

	protected int age = 35;
	protected float weight = 45;
	protected float bmi = 25;
	protected void msg ()
	{
		System.out.println(age);
		System.out.println(weight);
		System.out.println(bmi);
	}
	}
class HealthDriver
{
	public static void main (String args [])
	{
		Health obj = new Health ();
		System.out.println("Age is: " +obj.age +"years");
		System.out.println("Weight is:" +obj.weight +"Kg");
		System.out.println("The bmi is:" +obj.bmi + "kg/m^2");
		obj.msg();
		
	}
	
}