package casting;
class Machine {
	public void start() {
		System.out.println("Machine startred");
	}
}
class Camera extends Machine {
public void start() {
			System.out.println("camera startred");
		}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class app {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine ();
		Camera camera1 = new Camera ();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// upcasting - going up the class
		Machine machine2 = camera1;
		machine2.start();
		
		//  error - machine2.snap(); bcos machine has only one method start()
       // Downcasting
		
		Machine machine3 = new Camera();
		Camera camera2= (Camera)machine3;
		camera2.snap();
		camera2.start();
		
		//Dosent work , run time error
		Machine machine4 = new Machine ();
		Camera camera3 =  (Camera)machine4;
		camera3.start();
		camera3.snap();
		
		
		
		
		
	}

}
