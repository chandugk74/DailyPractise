package interviewQuestions;

import basics.Dummy;

public class Employee1 {
int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
	    emp.setId(1);
//	    fun2(emp);
	    emp=fun2(emp);
	    System.out.println(emp.getId()); // This will print 1, not 100
	  }

	  public static Employee1 fun2(Employee1 emp) {
		  emp = new Employee1();
		  System.out.println("line no 28: "+emp.getId());
	    emp.setId(100); // Modifying the original emp object
	    return emp;
	    }
}
