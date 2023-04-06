package semester1p;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class semestermain {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Student[] student= new Student[5];
		Teacher[] teacher = new Teacher[3];
		
		for (int i=0; i<5; i++) {
			
			System.out.println("Enter values for student " + (i+1)+ ": ");
			
			Scanner a = new Scanner(System.in);
			System.out.println("Enter first name: ");
			String fn = a.nextLine();
			
			Scanner b = new Scanner(System.in);
			System.out.println("Enter last name: ");
			String ln = b.nextLine();
			
			Scanner c = new Scanner(System.in);
			System.out.println("Enter birthday date: ");
			String bd = c.nextLine();
			
			Scanner d = new Scanner(System.in);
			System.out.println("Enter Phone 1: ");
			String p1 = d.nextLine();
			
			Scanner e = new Scanner(System.in);
			System.out.println("Enter Phone 2: ");
			String p2 = e.nextLine();
			
			Scanner f = new Scanner(System.in);
			System.out.println("Enter Email: ");
			String em = f.nextLine();
			
			Scanner k = new Scanner(System.in);
			System.out.println("Enter amk: ");
			String am2 = k.nextLine();
			
			Scanner h = new Scanner(System.in);
			System.out.println("Enter class: ");
			String clas = h.nextLine();
			
			student[i] = new Student(fn, ln, bd, p1, p2, em, am2, clas);
			
		}
		
		for (int i=0; i<3; i++) {
			
			System.out.println("Enter values for teacher " + (i+1)+ ": ");
			
			Scanner a = new Scanner(System.in);
			System.out.println("Enter first name: ");
			String fn = a.nextLine();
			
			Scanner b = new Scanner(System.in);
			System.out.println("Enter last name: ");
			String ln = b.nextLine();
			
			Scanner c = new Scanner(System.in);
			System.out.println("Enter birthday date: ");
			String bd = c.nextLine();
			
			Scanner d = new Scanner(System.in);
			System.out.println("Enter Phone 1: ");
			String p1 = d.nextLine();
			
			Scanner e = new Scanner(System.in);
			System.out.println("Enter Phone 2: ");
			String p2 = e.nextLine();
			
			Scanner f = new Scanner(System.in);
			System.out.println("Enter Email: ");
			String em = f.nextLine();
			
			Scanner g = new Scanner(System.in);
			System.out.println("Enter title for teacher N." + (i+1) + ": ");
			String tit = g.nextLine();
			
			Scanner h = new Scanner(System.in);
			System.out.println("Enter title description for teacher N." + (i+1) + ": ");
			String titde = h.nextLine();
			
			teacher[i] = new Teacher(fn, ln, bd, p1, p2, em, tit, titde);
			
		}
		
		int searchi = -1;
		String searchtype="";
		
		do  {
		Scanner searcht = new Scanner(System.in);
		System.out.println("Enter the type of the person you want to look for(1=Teacher, 2=Student, 0=Exit)");
		searchtype = searcht.nextLine();
		
		Scanner searchn = new Scanner(System.in);
		System.out.println("Enter the last name of the person you want to look for");
		String searchname = searchn.nextLine();
		
		if (searchtype.equals("2")) {
			for (int i=0; i<student.length; i++) {
				if ((student[i].lname).equals(searchname)) {
					searchi=i;
					student[i].showInfo();
					break;
				}
			}
		}
		
		if (searchtype.equals("1")) {
			for (int i=0; i<teacher.length; i++) {
				if ((teacher[i].lname).equals(searchname)) {
					searchi=i;
					teacher[i].showInfo();
					break;
				}
			}
		}
		
		if(searchi==-1)
			System.out.println("Search target not found");
		
		searchi=-1;
		} 
		while (searchtype!="0");
	}
		
}
