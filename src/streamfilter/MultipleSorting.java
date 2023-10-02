package streamfilter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class MultipleSorting {
	String name;
	int age;
	int salary;
	public MultipleSorting(String name, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "MultipleSorting [name=" + name  + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		List<MultipleSorting> emp = new ArrayList<MultipleSorting>();
		emp.add(new MultipleSorting("aaa",  65000));
		emp.add(new MultipleSorting("abc", 45000));
		emp.add(new MultipleSorting("aaa",  25000));
		emp.add(new MultipleSorting("ghi",  25000));
		
		emp.stream().sorted(Comparator.comparing(MultipleSorting::getSalary)
				.thenComparing(MultipleSorting::getName)).forEach(System.out::println);
//		emp.sort(Comparator.comparing(MultipleSorting::getSalary)
//		.thenComparing(MultipleSorting::getName));
//		System.out.println(emp);
	}
}
