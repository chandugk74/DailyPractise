package objects;

import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	String lastname;
	int rollnum;
	DateOfBirth Dob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public DateOfBirth getDob() {
		return Dob;
	}

	public void setDob(DateOfBirth dob) {
		Dob = dob;
	}

	public Student(String name, String lastname, int rollnum, DateOfBirth dob) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.rollnum = rollnum;
		Dob = dob;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", rollnum=" + rollnum + ", Dob=" + Dob + "]";
	}

	public static void main(String[] args) {
		DateOfBirth dateOfBirth = new DateOfBirth(1, 2, 3);
		Student student1 = new Student("chandru", "gk", 1, dateOfBirth);
		System.out.println(student1);

		List<Student> ll = new ArrayList<>();
		ll.add(new Student("chandru", "gk", 1, new DateOfBirth(4, 5, 6)));
		ll.add(new Student("Bhanu", "km", 2, new DateOfBirth(1, 2, 3)));
		System.out.println(ll);
		
		Student student2 = new Student("chandru", "gk", 1, new DateOfBirth(4, 5, 6));
		Student student3 = new Student("Bhanu", "km", 2, new DateOfBirth(1, 2, 3));
		System.out.println(student2);
		System.out.println(student3);

//		student.setDob(new DateOfBirth(1, 1, 11));
//		student.setLastname("abc");
//		student.getName()
//		System.out.println(student.getLastname());
//		System.out.println(student.getDob());
//		System.out.println(dateOfBirth);

	}

}