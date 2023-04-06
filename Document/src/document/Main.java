package document;

import java.io.File;  
import java.io.FileWriter;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		try {
		File f= new File("txt1.txt");
		File f2= new File("txt2.txt");
		Scanner reader= new Scanner(f);
		FileWriter fw = new FileWriter(f2);
		String line="";
		
		while(reader.hasNextLine()) {
			line=reader.next();
			while(line.contains("  "))
			line=line.replaceAll("  ", " ");
			System.out.println(line);
			fw.write(line+"\r\n");
		}
		reader.close();
		fw.flush();
		fw.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			
		}finally {
			
		}
		
		

	}

}
