package inheritence;
class Parent {
	String name;

	void method()
	{
		System.out.println("Method from Parent");
	}

	void Newmethod() {
		
	}
}

class Child extends Parent {
	int id;
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
public class GFG1 {

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

