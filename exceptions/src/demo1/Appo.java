package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Appo {

	public static void main(String[] args)  {

		File file = new File("text.txt");

		try {
			FileReader fr = new FileReader(file);
			
			////this wont work if there is an exception
			System.out.println("continuing...");
		} catch (FileNotFoundException e) {
			 System.out.println("File not fount :" + file.toString());
		}
		
		System.out.println("finished...");

	}

}
