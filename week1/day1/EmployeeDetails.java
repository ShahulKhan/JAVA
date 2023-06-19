package week1.day1;

public class EmployeeDetails {
	
	public void empName (String empName) {
		System.out.println("Employee Name - " +empName);
	}
	
	public void empId (int empId) {
		System.out.println("Employee Id - " +empId);
	}
	
	public void empAge (int empAge) {
		System.out.println("Employee Age - " +empAge);
	}
	
	public void empSalary (double empSalary) {
		System.out.println("Employee Salary - " +empSalary);
	}
	
	public void empMobNum (long empMobNum) {
		System.out.println("Employee Mobile Number - " +empMobNum);
	}
	
	public void empAdd (String empAdd) {
		System.out.println("Employee Address - " +empAdd);
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails empDetials =new EmployeeDetails();
		
		empDetials.empName("RAJINI KANTH");
		empDetials.empId(0001);
		empDetials.empAge(72);
		empDetials.empSalary(1000000000);
		empDetials.empMobNum(9826507431l);
		empDetials.empAdd("Poes Garden");
		
	}
}