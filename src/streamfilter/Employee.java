package streamfilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Employee {
	private String name;
	private String account;
	private Integer salary;

	public Employee(String name, String account, Integer salary) {
		super();
		this.name = name;
		this.account = account;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public static void main(String a[]) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("abc", "Accounts", 8000));
		empList.add(new Employee("aba", "Admin", 30000));
		empList.add(new Employee("ghi", "Admin", 40000));
		empList.add(new Employee("jkl", "Admin", 50000));
		empList.add(new Employee("mno", "Admin", 60000));
		empList.add(new Employee("b", "Accounts", 8000));

//Sort by salary, if salary same, then sort by names		
		empList.stream().sorted(Comparator.comparing(Employee::getSalary)
				.thenComparing(Employee::getName)).forEach(System.out::println);
// sorting on Aescending order by name
	Comparator<Employee> NameCommparator = Comparator.comparing(Employee::getName);
	List<Employee> listSorted = empList.stream().sorted(NameCommparator).collect(Collectors.toList());
	System.out.println("Aescending order by name:" + listSorted);
	
//sorting on Aescending order by salary
	Comparator<Employee> SalaryCommparator = Comparator.comparing(Employee::getSalary);
	listSorted = empList.stream().sorted(SalaryCommparator.reversed()).collect(Collectors.toList());
	System.out.println("Descending order by salary:" + listSorted);
//To fetch the second Highest Salary
	Optional<Employee> emp = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
							.reversed()).skip(1).findFirst();
	System.out.println("Second highest salary is : "+emp.get());
// find employees whose salaries are above 10000 and increment their salary by 10%
	empList.stream().filter(employee -> employee.getSalary() > 10000)
				.forEach(employee -> employee.setSalary(employee.getSalary() * 110 / 100));
		System.out.println(" The salary after 10% hike is : " + empList);
// Salary between 20000 and 50000
List<Employee> filteredEmployees = empList.stream().filter(employee -> employee.getSalary() > 20000 
									&& employee.getSalary() < 50000).collect(Collectors.toList());
System.out.println(filteredEmployees);
//filteredEmployees.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSalary()));
    
	}
}
