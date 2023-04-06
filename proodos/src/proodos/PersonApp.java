package proodos;

public class PersonApp 
{

	public static void main(String[] args) 
	{
		Student[] arrS;
		Teacher[] arrT;
		
		arrS  = new Student[5];
		arrT  = new Teacher[3];
				
	    arrS[0] = new Student("Vassilis","Karageorgioy",2000,"21054213451","V.k@gmail.com",12,"A53");
	    arrS[1] = new Student("Vassilis","Iwannoy",2000,"21054213451","V.k@gmail.com",12,"A53");
	    arrS[2] = new Student("Vassilis","Plastiras",2000,"21054213451","V.k@gmail.com",12,"A53");
	    arrS[3] = new Student("Vassilis","Mamalakhs",2000,"21054213451","V.k@gmail.com",12,"A53");
	    arrS[4] = new Student("Vassilis","Stavroy",2000,"21054213451","V.k@gmail.com",12,"A53");
	    
	    arrT[0] = new Teacher("Vaggelis","Iwannoy",1980,"210523424123","V.I@gmail.com","Professor","Psychics");
	    arrT[1] = new Teacher("Vaggelis","Iwannoy",1980,"210523424123","V.I@gmail.com","Professor","Psychics");
	    arrT[2] = new Teacher("Vaggelis","Iwannoy",1980,"210523424123","V.I@gmail.com","Professor","Psychics");
	    
	    
	    for (int i = 0; i < arrT.length; i++)
	    {
              arrT[i].showInfo();
	    }
	    for (int j = 0; j < arrS.length; j++)
	          arrS[j].showInfo();
	    
	   
	}
}
  


