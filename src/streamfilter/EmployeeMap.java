package streamfilter;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeMap {

	private String name;
	private int salary;

	public EmployeeMap(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeMap [name=" + name + ", salary=" + salary + "]";
	}

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

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("def", 9000);
		map.put("ghi", 10000);
		map.put("abc", 20000);
		map.put("jkl", 30000);
		map.put("a", 9000);
//Sort by salary, if salary same, then sort by names		
map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
.thenComparing(Map.Entry.<String,Integer>comparingByKey())).forEach(System.out::println);
//	Sort by employee name
map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey())
.forEach(System.out::println);
// sort by employee salary
map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue())
.forEach(System.out::println);
// second high salary
Map.Entry<String, Integer> finalResult = map.entrySet().stream()
.sorted(Comparator.comparing(entry -> -entry.getValue())).toList().get(1);
System.out.println("second high salary is : " + finalResult);
//if the map contain multiple second high salaries
Map<Integer, List<String>> interimResult = map.entrySet().stream().collect(Collectors.groupingBy(
entry -> entry.getValue(), Collectors.mapping(entry -> entry.getKey(), Collectors.toList())));
System.out.println("second high salary is : " + interimResult);
// find employees whose salaries are above 10000 and increment their salary by 10%
map.entrySet().stream().filter(emp -> emp.getValue() > 10000)
.forEach(emp -> emp.setValue(emp.getValue() * 110 / 100));
System.out.println(map);
	}
}
