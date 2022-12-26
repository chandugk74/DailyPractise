package streamfilter;

public class Employee {
	private Integer employeeId;
	private String employeeName;
	private Integer employeeAge;

	public Employee() {

	}

	public Employee(Integer employeeId, String employeeName, Integer employeeAge) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Employee{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", employeeAge="
				+ employeeAge + '}';
	}
}
