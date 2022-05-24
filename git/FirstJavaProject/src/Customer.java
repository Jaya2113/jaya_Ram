/* Write an algorithm to implement access modifier functionality.
 * Create two separate classes Customer & CustomerDriver inside com.greatlearning.javacore; package.
 * Create various variables in class Customer of different access modifiers such as (private, public,protected) and initialize them with some values.
 * Algorithm:
 * 1. Start
 * 2. Create a package co.greatlearning.javacore;
 * 3. Create Customer and CustomerDriver class under same package.
 * 4. Declare int age as private, float weight as protected and float height as public data members in class Customer.
 * 5.create a main method in CustomerDriver class.
 * 6. create object obj in class CustomerDriver to access the members from class Customer.
 * 7. Display all the variables in class CustomerDriver.
 
 */

package com.greatlearning.corejava;

public class Customer {
	//private int age=20;
	protected float weight=35;
	public float height=5;
}
	
	 class CustomerDriver
	{
		
	public static void main(String[] args) {
		
	Customer obj=new Customer();
	//System.out.println("The age is:"+ obj.age);
	System.out.println("The weight is:"+ obj.weight);
	System.out.println("The height is:" + obj.height);
	
	}
	}


