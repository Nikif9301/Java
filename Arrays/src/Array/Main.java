package Array;

import java.util.ArrayList;



public class Main {

	public static void main(String[] args) {
		
		 /*ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Ferrari");
		    for (int i = 0; i < cars.size(); i++) {
		      System.out.println(cars.get(i));*/
		 
	ArrayList<Integer> myNumbers1 = new ArrayList<Integer>();
    myNumbers1.add(14);
    myNumbers1.add(4);
    myNumbers1.add(20);
    myNumbers1.add(61);
    myNumbers1.add(32);
    myNumbers1.add(17);
    myNumbers1.add(7);
    
	ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
    myNumbers2.add(14);
    myNumbers2.add(4);
    myNumbers2.add(4);
    myNumbers2.add(50);
    myNumbers2.add(13);
    myNumbers2.add(12);
    myNumbers2.add(3);
    
    int sum1=0;
    int sum2=0;
    float sub;
  
       for (int i : myNumbers1) {
    	    sum1 += i;
    	
        
     
    }
    
       for (int j : myNumbers2) {
    	    sum2 += j;
    	
        
     
    }
    System.out.println(sum1);
    System.out.println(sum2);
    sub=sum2-sum1;
    System.out.println(sub);
    
  
	}
}

//}
