package proodos;

public class Student extends Person {
	 int amk;
	 String Class;
	
	public Student(String firstname, String lastname, int birthdate, String phone, String email,int amk,String Class) 
	{
		super(firstname, lastname, birthdate, phone, email);
		this.amk=amk;
		this.Class=Class;
    }

	public String getInfo() {
		return "You are " + firstname +" " + lastname +" and you are born in the year " + birthdate +" your phone is "+ phone+" and your email is "+ email+" Your amk is " + amk  +" and you study at " + Class;
	}
	
}



