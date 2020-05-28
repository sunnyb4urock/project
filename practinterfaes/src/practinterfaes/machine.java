package practinterfaes;


public class machine implements Info {
	private int id = 7;
	
	public void start() {
		System.out.println("machine start");
	}

	
	public void showInfo() {
		 System.out.println("the id is :" + id);
		
	}

}
