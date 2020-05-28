package strung;

class Frog {
	
	private int id;
	private String name;
	
	public Frog(String name, int id) {
		this.id =id;
		this.name= name;
	}
	
	public String toString() {
		
		// in efficient way
		// return id +":" + name;
		
		// efficient way to concat strings
		StringBuilder sb = new StringBuilder () ;
			sb.append(id).append(":").append("name");
			return sb.toString();			
	}
	
}

public class app {

	public static void main(String[] args) {
      Frog frog1 = new Frog("bob", 7);
      Frog frog2 = new Frog("koko", 1);
      
      System.out.println(frog1);
      System.out.println(frog2);

	}

}
