package practinterfaes;

public class app {

	public static void main(String[] args) {
		
		machine mech1= new machine ();
		mech1.start ();
		
		person person1 = new person("KOKO");
		person1.greet();
		
		Info info1= new machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		System.out.println();
		
		 Outputinfo(mech1);
		 Outputinfo(person1);
		
		}
	private static void Outputinfo(Info info) {
		info.showInfo();
	}

}
