package streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	String name;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary + "]";
	}
public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Chandru", 80000));
		list.add(new Employee("Amit", 90000));
		list.add(new Employee("Bhanu", 75000));
	
		List<Employee> 
//sorting on Aescending order by name
//		Comparator<Employee> NameCommparator = Comparator.comparing(Employee::getName);
		listSorted = list.stream().sorted(Comparator.comparing(Employee::getName))
		.collect(Collectors.toList());
//		listSorted = list.stream().sorted(NameCommparator.reversed()).collect(Collectors.toList());
		System.out.println("Aescending order by name:" + listSorted);

//sorting on Aescending order by salary
		Comparator<Employee> SalaryCommparator = Comparator.comparing(Employee::getSalary);
		listSorted = list.stream().sorted(SalaryCommparator).collect(Collectors.toList());
//		listSorted = list.stream().sorted(SalaryCommparator.reversed()).collect(Collectors.toList());
		System.out.println("Aescending order by salary:" + listSorted);

	}
	
}