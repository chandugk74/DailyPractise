package streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeGender {
	private String name;
    private String gender;

    public EmployeeGender(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

public static void main(String[] args) {
List<EmployeeGender> employees = Arrays.asList(
            new EmployeeGender("Alice", "female"),
            new EmployeeGender("Bob", "male"));
List<EmployeeGender> femaleEmployees = employees.stream()
.filter(employee -> "female".equals(employee.getGender()))
.collect(Collectors.toList());
femaleEmployees.forEach(System.out::println);
    }
}
