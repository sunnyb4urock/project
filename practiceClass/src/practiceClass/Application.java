package practiceClass;

class person {
	
	String name;
	int age;
	float weight;
	char sex;
	String prefix;
	
		
}

public class Application {

	public static void main(String[] args) {
		
		
	person person1 = new person();
	
	person1.name = "kaka";
	person1.age =  25;
	person1.weight = 78;
	person1.sex = 'M';
	person1.prefix = "Mr." ;
	

	person person2 = new person();
	person2.name = "yoo";
	person2.age =  28;
	person2.weight = 70;
	person2.sex = 'F';
	person2.prefix = "Miss." ; 
	
	System.out.println(person1.name);
	System.out.println(person1.age);
	System.out.println(person1.weight);
	System.out.println(person1.sex);
	System.out.println(person1.prefix);
	
	
	}

}
