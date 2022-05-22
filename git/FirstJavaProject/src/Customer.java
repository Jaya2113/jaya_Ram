
/* Question

Write an algorithm to create a class Customer that contains 

          fullName(String) and age(int) as variables in class. 

Create a main method, assign values to the variables in the main method and print the values of variables using the object of the main method. 

After writing the algorithm, write suitable code, run the program, and check the output.*/

 
class Customer {
	int age;
	String fullName;
}
class custo
{
	public static void main(String[] args) 
	{
		Customer s1=new Customer();
		s1.age=40;
		s1.fullName="Krishna Shree Ram";
		System.out.println(s1.age+ " " +s1.fullName);
		

	}

}
