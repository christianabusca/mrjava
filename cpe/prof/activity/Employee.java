package cpe.prof.activity;

public class Employee extends Person{
	
	private int employeeId;
    private String jobTitle;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
	public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
		super(firstName, lastName);
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}
	
	// THIS IS FROM ANOTHER NUMBER

	public void work() {
		System.out.println("The employee is working");
	}
	public void getSalary(int x) {
		System.out.println("You will get "
				+ "a total salary of: " + x);
	}
	
	
	
	
}
