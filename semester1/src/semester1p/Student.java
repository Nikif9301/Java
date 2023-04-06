package semester1p;

public class Student extends Person{
	
	String amk;
	String class1;
	
	public Student(String fname, String lname, String birthdate, String phone1, String phone2, String email, String amk, String class1) {
		super(fname, lname, birthdate, phone1, phone2, email);
		this.amk = amk;
		this.class1 = class1;
	}
	
	public String getInfo() {
		return "Student " + " First name: " + fname + " Last name: " + lname + " Birth Date: " + birthdate + " Phone 1: " + phone1 + " Phone 2: " + phone2 + " Email: " + email + " Amk: " + amk + " Class: " + class1;
	}
}
