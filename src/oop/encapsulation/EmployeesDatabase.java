package oop.encapsulation;

public class EmployeesDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Employees em1 = new Employees(101,"Tanvir Ahmmed","7thJan1985", "IT Dept");
		 //int EmpId,String EmployeeName,String Dob, String DeptName
		 //
		System.out.println(em1.getEmployeeName());
		System.out.println(em1.getEmpId());
		System.out.println(em1.getDeptName());
		System.out.println(em1.getDob());
		
		// Also we can set the value using Get n set methods 
		
		
	 em1.setDeptName("Software");
	 em1.setEmpId(102);
	 em1.setDob("101.12.12");
	 em1.setEmployeeName("Tanzir Ahmed");
	 
	 System.out.println("Employee ID : "+em1.getEmpId()+" Employee Name : "+em1.getEmployeeName()+" Dept Name : "+em1.getDeptName()+" Dob :"+em1.getDob());
		
		 //em1.EmployeeName;
		 
	}

}
