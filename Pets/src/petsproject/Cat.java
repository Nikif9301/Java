package petsproject;

public class Cat extends Pet{
	public Cat(String name,int year) {
		this.name=name;
		this.year=year;		
	}
		
		public String getInfo() {
			return "I am " + name +" and i am born in the year " + year;
			
			
		}
		public void showInfo() {
			System.out.println(getInfo());
			
		}
		
		
	}


