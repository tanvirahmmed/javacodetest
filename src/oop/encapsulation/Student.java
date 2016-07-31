package oop.encapsulation;

public class Student {
private int StudentId;
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public int getSsn() {
	return Ssn;
}
public void setSsn(int ssn) {
	Ssn = ssn;
}
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}
private String StudentName;
private int Ssn;
private String Dob;

	
}
