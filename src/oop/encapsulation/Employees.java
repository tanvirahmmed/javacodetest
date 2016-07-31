package oop.encapsulation;

public class Employees {
	
	private int EmpId;
	private String EmployeeName;
	private String Dob;
	private String DeptName;
	

	public Employees()
	{
		
	}
	
	public Employees(int EmpId,String EmployeeName,String Dob, String DeptName)
	{
		this.DeptName = DeptName;
		this.EmpId= EmpId;
		this.DeptName = DeptName;
		this.EmployeeName = EmployeeName;
		
	}

	
	
	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getDeptName() {
		return DeptName;
	}

	public void setDeptName(String deptName) {
		DeptName = deptName;
	}


	
	
}
