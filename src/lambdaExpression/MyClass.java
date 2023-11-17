package lambdaExpression;

interface TwoArgInterface {

    public int operation(int a, int b);
}

public class MyClass {

    public static void main(String javalatte[]) {
        // this is lambda expression
        TwoArgInterface plusOperation = (a, b) -> a + b;
        System.out.println("Sum of 10,34 : " + plusOperation.operation(10, 34));

    }
}
