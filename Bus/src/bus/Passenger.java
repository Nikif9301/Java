package bus;

import java.util.ArrayList;
import java.util.Random;
public class Passenger {

	public static void main(String[] args) {
		Random r = new Random();
		
		ArrayList<Stash> StopNames = new ArrayList<Stash>();
	    StopNames.add(new Stash("Αφετηρια"));
	    StopNames.add(new Stash("Αγια Ειρηνη"));
	    StopNames.add(new Stash("Χριστιανουπολεωeς"));
	    StopNames.add(new Stash("Πυθιας"));
	    StopNames.add(new Stash("Εσπεριδων"));
	    StopNames.add(new Stash("Παλιο Τερμα"));
	    StopNames.add(new Stash("Συκια"));
	    StopNames.add(new Stash("Λιναρα"));
	    StopNames.add(new Stash("Χατζηδακη"));
	    StopNames.add(new Stash("Αγιος Λουκας"));
	
		
		
		for(int i = 0; i <StopNames.size(); i++) {
		   
		  
		   int randomin = r.nextInt(15);
		   int randomexit = r.nextInt(randomin+1);
		   System.out.println("Total passenger that entered on stop " + StopNames.get(i).name +" :" + randomin );
		   System.out.println("Total passenger that exited on stop " + StopNames.get(i).name +" :" + randomexit );
		   
		   StopNames.get(i).in= randomin;
		   StopNames.get(i).out = randomexit;		   
		   	   
		   
	
		}

		int sum = 0;
		int exits = 0;
		for(Stash s : StopNames) {
		  sum += s.in;
		  exits= sum - s.out;
		}
		System.out.println("Total passengers that entered thought the ride: " + sum);
		System.out.println("Total passengers that left thought the ride: " + exits);

	}

}

