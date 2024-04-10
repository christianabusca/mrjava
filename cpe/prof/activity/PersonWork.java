package cpe.prof.activity;

public class PersonWork {

	public static void main(String[] args) {
		Employee employee = new Employee("Christian", 
				"Abusca", 
				136688, 
				"Computer Engineer");

		System.out.println("First Name: " + 
		employee.getFirstName());
		System.out.println("Last Name: " + 
		employee.getLastName());
		System.out.println("Employee ID: " + 
		employee.getEmployeeId());
		
	}

}
