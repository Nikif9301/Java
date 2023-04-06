package petsproject;

public class Pet {
	String name="Babis";
	int year=2020;
	public Pet(String name) {
		this.name=name;
	}
	public Pet() {
		
	}
	public Pet(String name,int year) {
		this.name=name;
		this.year=year;
	}
	
	
	public  String getInfo() {
	
	return "I am " + name +" and i am born in the year " + year;
	}
    
	
	public void showInfo() {
		System.out.println(getInfo());
		
	}
}

