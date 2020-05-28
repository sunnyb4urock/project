package practinterfaes;

// extend can extend only one class , but interface(implements) can implements n number of class
public class person implements Info {
	
	

	private String name;

	public person(String name) {

		this.name = name;
	}

	public void greet() {
		System.out.println("Helllo there");

	}

	
	public void showInfo() {
		System.out.println("the name is :" + name);
		
	}

}
