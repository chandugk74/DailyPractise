package constructor;

public class Main extends Constructor {
	Main() {
		super(30);
		System.out.println("It is child class constructor");
	}

	public static void main(String[] args) {
		Main mm = new Main();
	}

}
