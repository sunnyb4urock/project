package thisss;

class frog {
	int age;
	String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int  getAge () {
		return age;
	}
}

public class app {

	public static void main(String[] args) {
		
		frog frog1 = new frog();
		frog1.age = 1;
		frog1.name = "koko is  ";
		
	System.out.println(frog1.getName() + frog1.getAge() + " years old");

	}

}
