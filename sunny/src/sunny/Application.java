package sunny;

class Person{
	
	String name;
	int age;
	
	void speak() {
		System.out.println("my name is " + name);
	}
	  int calculateYearsleftToRetirement() {
	  int yearsLeft = 65- age;
	  return yearsLeft ;
	}
	  int getAge() {
		  return age;
	  }
	  String getName() {
		  return name;
		  
	  }
}

public class Application {

	public static void main(String[] args) {
		
		Person person1= new Person();
		person1.name = "vibhu";
		person1.age = 25;
		
		person1.speak();
		int years = person1.calculateYearsleftToRetirement();
		System.out.println("Years left to retirement :" + years);
		
		int age = person1.getAge();
		String name = person1.getName();
		System.out.println("My name is :" + name);
		System.out.println("my age is :" + age);
		}
	

}
