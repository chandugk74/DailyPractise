package LambdaExpression;

public class NoParameterLambda {
	public static void main(String[] args) {
		NoParam noParam=()->{
			return "I love java";
		};
		System.out.print(noParam.draw());
	}

}
