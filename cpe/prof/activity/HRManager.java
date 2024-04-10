package cpe.prof.activity;

public class HRManager extends Employee {


	public HRManager(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName, employeeId, jobTitle);
		// TODO Auto-generated constructor stub
	}

	public void work() {
		System.out.println("HRManager is "
				+ "currenly working");
	}

	public void addEmployee() {
		System.out.println("HR Manager is "
				+ "adding a new employee");
	}

}
