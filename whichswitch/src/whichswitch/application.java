package whichswitch;
import java.util.Scanner;
public class application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in) ;
		
		System.out.println("Enter your string:");
		
		int T = input.nextInt();
		
		switch(T) {
		case 1:
		System.out.println("Machine started");
		break;
		
		case 2:
		System.out.println("machine stopped");
		
		break;
		
		default :
			System.out.println("None of the correct case value given ");
		
		}
		

	}

}
