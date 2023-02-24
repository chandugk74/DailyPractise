package LambdaExpression;

public class WithLambdaExpression {
	public static void main(String[] args) {
		int width = 20;
		Drawable drawable = () -> {
			System.out.println("drawing width: " + width);
		};
		drawable.draw();
	}

}
