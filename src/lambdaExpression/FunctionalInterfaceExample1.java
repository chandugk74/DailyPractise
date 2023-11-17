package lambdaExpression;

@FunctionalInterface
interface FunctionalInterfaceEx1 {
//	abstract method
	public String printName(String ename, String eaddress);

//	default method
	default int defaultEx(int a, int b) {
		return a + b;
	}

	static String staticEx(String name, String address) {
		return name+" "+address;
	}
}

public class FunctionalInterfaceExample1 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		String name="chandra";
		String address="java";
		FunctionalInterfaceEx1 fix=(ename, eaddress)->ename + eaddress;
			System.out.println(fix.printName("1"," "+ "chandra"));
			System.out.println(FunctionalInterfaceEx1.staticEx("chandra", "java"));
			System.out.println(fix.defaultEx(a, b));
	}
}
