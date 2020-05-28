package generaics;

import java.util.ArrayList;
import java.util.HashMap;

class animal {
	
}

public class App {

	public static void main(String[] args) {
		
		////Before java 5///////
		ArrayList list = new ArrayList ();
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		
		String fruit =  (String)list.get(0);
		System.out.println(fruit);
		 
		////////////Modern Style//////////
		ArrayList<String> Strings = new ArrayList<String> ();
		
		Strings.add("cat");
		Strings.add("koko");
		Strings.add("shadow");
		
		String animal = Strings.get(1);
		System.out.println(animal);
		
		///////////There can be more than one type of arguments in a class/////////
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		////////java 7 style///////////////////
		
		ArrayList <animal> someList = new ArrayList<>();
	}

}
