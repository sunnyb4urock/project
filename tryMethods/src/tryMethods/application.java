package tryMethods;

class Person {
	
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is " + name + " i am "+ age +" yesrs of age");
	}
	
	void helloMap () {
		for(int i=0; i<2; i++) {
		System.out.println("you are my man");
	}
	}
	
}

public class application {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "daku";
		person1.age  = 26;
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "koko";
		person2.helloMap ();
		
	  System.out.println(person1.name);
	
	}
	
        
	
}
