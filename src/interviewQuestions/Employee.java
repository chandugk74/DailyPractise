package interviewQuestions;

public class Employee {
int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		  emp.setId(1);
		  fun2(emp);
		  System.out.println(emp.getId());

	}

	private static void fun2(Employee emp) {
		emp = new Employee();
		  emp.setId(100);		
	}

}
