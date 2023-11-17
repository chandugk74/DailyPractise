package lambdaExpression;

public class WithoutLambdaExpression {
	public static void main(String[] args) {
		int width = 10;
		Drawable drawable = new Drawable() {
			@Override
			public void draw() {
				System.out.println("drawing : " + width);
			}
		};
		drawable.draw();
	}
}
