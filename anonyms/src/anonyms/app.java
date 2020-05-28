package anonyms;

class Machine {
	public void start () {
		System.out.println("Machine running..");
	}
}

interface Plant {
	public void grow();
}
public class app {

	public static void main(String[] args) {
		Machine machine1 = new Machine () {
			@Override public void start() {
				System.out.println("Camera snapping");
			}
		};
		machine1.start();
		
		Plant plant1 = new Plant(){
			@Override
			public void grow() {
				 System.out.println("Plant growing");
				
			}
			
		};
		plant1.grow();
		
		 
	}

}
