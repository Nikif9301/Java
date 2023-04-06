package proodos;


public class Person {

    String firstname;
    String lastname;
    int birthdate;
    String phone;
    String email;

	public Person(String firstname,String lastname,int birthdate,String phone,String email) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.birthdate=birthdate;
		this.phone=phone;
		this.email=email;
	}
	
	public String getInfo() {
	
		return "You are " + firstname +" " + lastname +" and you are born in the year " + birthdate +" your phone is "+ phone+" and your email is "+ email;
	}
	
	public void showInfo() {
		System.out.println(getInfo());
		
	}

}
