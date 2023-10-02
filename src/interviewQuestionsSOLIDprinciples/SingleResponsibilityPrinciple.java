package interviewQuestionsSOLIDprinciples;
//SRP states that a class should have only one reason to change,
//meaning it should have only one responsibility.
public class SingleResponsibilityPrinciple {
	// Violating SRP - A class with multiple responsibilities
	class Employee {
	    void calculateSalary() {
	        // Calculate employee's salary
	    }

	    void saveEmployeeData() {
	        // Save employee's data to the database
	    }
	    
//	 *****   it should be divide like below *****
//	     separate above responsibilities into different classes
	    class SalaryCalculator {
	        void calculateSalary(Employee employee) {
	            // Calculate employee's salary
	        }
	    }

	    class EmployeeDataSaver {
	        void saveEmployeeData(Employee employee) {
	            // Save employee's data to the database
	        }
	    }
	    
	}

}
