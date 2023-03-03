package objectInitialization;

public class Student123 {

	int id;
	String name;

	void insert(int no, String nam) {
		id = no;
		name = nam;
	}

	void display() {
		System.out.println(id + " " + name);
	}

}
