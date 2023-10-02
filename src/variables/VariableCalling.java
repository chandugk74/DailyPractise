package variables;

public class VariableCalling {
	static int a = 5;

	public void fun() {
		int b=10;
		System.out.println(a+ " "+b);
		a++; b++;
	}

	public static void main(String[] args) {
		VariableCalling vc = new VariableCalling();
		vc.fun();
		vc.fun();

	}

}
