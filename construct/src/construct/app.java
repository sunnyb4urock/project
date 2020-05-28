package construct;

class Machine {
	private String name;
	public Machine() {
//Constructor is special kind of method		
//constructor name , should be same is class name, with upper case. 
		
 System.out.println("Constructors running :1 ");
	}
	
	public Machine(String name) {
// two Constructors with same name can be created if PArameteres are different.		
		System.out.println("Seond constructor running : 2");
	}
}

public class app {

	public static void main(String[] args) {
		Machine Machine1 = new Machine() ;
        Machine Machine2 = new Machine("BOBO");
	}

}
