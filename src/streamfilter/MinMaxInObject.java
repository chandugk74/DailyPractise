package streamfilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxInObject {
	public static void main(String[] args) {

	    List<Employee> employeeList = new ArrayList<Employee>();
	    employeeList.add(new Employee(1, "Robert", 24));
	    employeeList.add(new Employee(2, "Tom", 21));
	    employeeList.add(new Employee(3, "Michel", 28));
	    employeeList.add(new Employee(4, "Ricky", 23));

	    Comparator<Employee> comparator = Comparator.comparing(Employee::getEmployeeAge);
	    Employee minObject = employeeList.stream().min(comparator).get();
	    Employee maxObject = employeeList.stream().max(comparator).get();
	    System.out.println("Max Object " + maxObject);
	    System.out.println("Min Object " + minObject);
	  }
}
