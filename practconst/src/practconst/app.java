package practconst;

class frog {
	int age;
	String name;
	public frog() {
		// this is also used to call other constructor and has to be the first satement
		this ("Arnie");
		System.out.println("constructor 1 running");
		
	}
	public frog(String name) {
		System.out.println("Constructor 2 is running");
		this.name= name;
	}
	public frog(String name, int age) {
		this();
		System.out.println("Constructor 3 is running");
		// this is used to differentiate b/w instance variable and local variable.
		this.name= name;
		this.age= age;
	}
}
public class app {

	public static void main(String[] args) {
		 frog frog1= new frog();
		 frog frog2 = new frog("Doremon");
		 frog frog3 = new frog("bobalu", 12);
		 
		 //frog1.name= "koko";
	}

}
