package objectAndClass;

public class TestStudent1 {

	public static void main(String[] args) {
		Student student = new Student(); //create the  obj of class having objects
		student.id=1;
		student.name="chandra";
		System.out.println(student.id+ " " +student.name);

		Student student2 = new Student(); //create the  obj of class having objects

		student2.id=2;
		student2.name="nalina";
		System.out.println(student2.id+ " " +student2.name);

	}

}
