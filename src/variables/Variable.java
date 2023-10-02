package variables;

public class Variable {
	static int a =10;//static variable
	int c=30;//instance variable

	public static void main(String[] args) {
		int b=20;//local variable
		System.out.println(b);//local variable called directly
		System.out.println(a);
		System.out.println(Variable.a);//static variable called by class name 
		Variable v = new Variable();
		System.out.println(v.c);//instance variable called by object reference

	}

}
