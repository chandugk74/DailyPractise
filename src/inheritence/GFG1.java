package inheritence;

//Java program to demonstrate
//Upcasting Vs Downcasting

//Parent class
class Parent {
	String name;

	// A method which prints the
	// signature of the parent class
	void method()
	{
		System.out.println("Method from Parent");
	}

	void Newmethod() {
		// TODO Auto-generated method stub
		
	}
}

//Child class
class Child extends Parent {
	int id;

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override
	void method()
	{
		System.out.println("Method from Child");
	}
	void Newmethod()
	{
		System.out.println("Method from New Child method");
	}
}

//Demo class to see the difference
//between upcasting and downcasting
public class GFG1 {

	// Driver code
	public static void main(String[] args)
	{
		// Upcasting
		Parent p = new Child();
		p.name = "GeeksforGeeks";

		//Printing the parent class name
		System.out.println(p.name);//GeeksforGeeks
		//parent class method is overridden method hence this will be executed
		p.method();// Method from Child
		p.Newmethod();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); - > compile time error

		// Downcasting Explicitly
		Child c = (Child)p;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
		
		Parent p1 = new Parent();
		p1.name="GeeksforGeeks";
		System.out.println(p.name); //		GeeksforGeeks
		p1.method();                //		Method from Parent


	}
}

