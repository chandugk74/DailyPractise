package streamfilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Employeee {
	private int salary;
	private String name;

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}

	public Employeee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		List<Employeee> emplist = new ArrayList<Employeee>();
		emplist.add(new Employeee(5000, "abc" ));
		emplist.add(new Employeee(6000, "dbc"));
		emplist.add(new Employeee(3000, "gbc"));

		Optional<Employeee> emp = emplist.stream().sorted(Comparator.comparingDouble(Employeee::getSalary)
				                 .reversed()).skip(1).findFirst();
		System.out.println(emp.get());

//		emplist.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
//	    .forEach(System.out::println);
//		emplist.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
//		System.out.println(emplist);

}
}
