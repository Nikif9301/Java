package semester1p;

public class Teacher extends Person{
	
	String title;
	String titledesc;
	
	public Teacher(String fname, String lname, String birthdate, String phone1, String phone2, String email, String title, String titledesc) {
		super(fname, lname, birthdate, phone1, phone2, email);
		this.title= title;
		this.titledesc = titledesc;
	}
	
	public String getInfo() {
		return "Teacher " + "First name: " + fname + "Last name: " + lname + "Birth Date: " + birthdate + "Phone 1: " + phone1 + "Phone 2: " + phone2 + "Email: " + email + "Title: " + title + "Title Description: " + titledesc;
	}
}
