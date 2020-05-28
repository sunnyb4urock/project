package access;

public class app {

	public static void main(String[] args) {
		plant plant1= new plant ();
		
		System.out.println(plant1.name);
		System.out.println(plant1.ID);
		 
		
		// wont work, type is private access only in the same class.
		//System.out.println(plant1.type);
		

	}

}
