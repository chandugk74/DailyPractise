package objectInitialization;

public class TestStudent {

	public static void main(String[] args) {
		Student123 student = new Student123();
		student.insert(1, "chandra");
		Student123 student1 = new Student123();
		student1.insert(2, "Bhanu");
		student.display();
		student1.display();
	}

}
