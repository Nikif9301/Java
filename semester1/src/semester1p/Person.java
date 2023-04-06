package semester1p;

public class Person {
	
	String fname = "no first name";
	String lname = "no last name";
	
	String birthdate = "no date";
	
	String phone1 = "no phone";
	String phone2 = "no phone";
	String email = "no email";
	
	public Person() {}
	
	public Person(String phone1,String phone2, String email, String birthdate) {
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.email = email;
		this.birthdate = birthdate;
	}
	
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Person(String fname, String lname, String birthdate, String phone1, String phone2, String email) {
		this.fname=fname;
		this.lname=lname;
		this.birthdate=birthdate;
		this.phone1=phone1;
		this.phone2=phone2;
		this.email=email;
	}
	
	public String getInfo() {
		return "First name: " + fname + "Last name: " + lname + "Birth Date: " + birthdate + "Phone 1: " + phone1 + "Phone 2: " + phone2 + "Email: " + email;
	}
	
	public void showInfo() {
		System.out.println(getInfo());
	}
	
}
