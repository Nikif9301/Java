package proodos;

public class Teacher extends Person {
	String Title;
	String TitleDesc;
	
	public Teacher(String firstname, String lastname, int birthdate, String phone, String email,String Title,String TitleDesc) 
	{
		super(firstname, lastname, birthdate, phone, email);
		this.Title=Title;
		this.TitleDesc=TitleDesc;
    }
	
	
	public String getInfo() {		
		return "You are " + firstname +" " + lastname +" and you are born in the year " + birthdate +" your phone is "+ phone+" and your email is "+ email+" Your are a " + Title  +" in " + TitleDesc;		
	}

}
