package practiceStringRay;

public class applicationString {

	public static void main(String[] args) {
		
		String [] values = new String [3];
		
		values [0]= "Hello Dear ,";
		values [1]= "My name is ";
		values [2]= "Sunny and my choice of fruits are : ";
		
		for(int i =0; i < values.length; i++) {
			System.out.printf(values[i]);
		}
		
		String[] fruits = {"apple ", "kiwi ","pineapple ", "mangoes "} ;
		for(String fruit : fruits ) {
			System.out.printf(fruit);
		}
		
	}

}
