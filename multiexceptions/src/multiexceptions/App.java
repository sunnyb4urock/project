package multiexceptions;

import java.io.IOException;
import java.text.ParseException;

public class App {
	
	public static void main (String[] args) {
      Test test = new Test ();
      
      /*
		
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			 System.out.println("Couldn't pass command file");
		}
		*/
      
      /*
      try {
		test.run();
	} catch (IOException | ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} */
      
      try {
		test.run();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	} 
	
	 
	}

}
