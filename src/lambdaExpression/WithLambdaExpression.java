package lambdaExpression;

public class WithLambdaExpression {
	public static void main(String[] args) {
			Drawable drawable = () -> {
			System.out.println(20);
		};
		drawable.draw();
	}

}
