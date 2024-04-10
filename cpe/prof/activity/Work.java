package cpe.prof.activity;

public class Work {

	public static void main(String[] args) {
		Employee emp = new Employee(null, null, 0, null);
		HRManager hrm = new HRManager(null, null, 0, null);
		
		System.out.println("This is for the employee");
		emp.work();
		int x = 30000;
		emp.getSalary(x);
		
		
		System.out.println("This is for the HRManage");
		hrm.work();
		hrm.addEmployee();
	}

}
