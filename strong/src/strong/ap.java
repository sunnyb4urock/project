package strong;

public class ap {

	public static void main(String[] args) {
		// inefficient	
		String  info = "";
		info += "my name is :";
		info += "BOBO and ";
		info += "i am 22";
		System.out.println(info);
		
		//efficient
		StringBuilder sb = new StringBuilder("");
		sb.append("my name is ") ;
		sb.append("koko and ");
		sb.append("21 years old");
		
		// more efficient
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		s.append("my name is sunny ") 
		 .append("iam 21")
		 .append("just do it");
		System.out.println(s.toString());
		
		////////// string formatting//////////////
		
		System.out.println("This is a new line \t new tab \n this is new line");
		System.out.printf("The cost is %d  \n quantity is %d", 7 , 450);
		System.out.printf("\n The road length  is %10d  \n breadth is %5d", 7 , 450);
		
		for(int i =0; i < 15; i++) {
			System.out.printf("%-2d:   some text here \n" , i);
			
		}
		
		System.out.printf("%.4f formatting float ", 5.6789546);
			
	}
	
		

}
