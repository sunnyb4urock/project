package valuespass;

class robot{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("jumping " +height +"meters");
	}
	public void move(String direction, int back) {
		System.out.println("go in the direction :" + direction + back +"meteres back");
	}
}

public class app {

	public static void main(String[] args) {
        // object creation
       robot sam = new robot();
       //passing parameters to method
       sam.speak ("my name is sam ");
       sam.jump(20);
       sam.move("Northeast ", 40);
       
       // even though here string greetings hold the value, but when it goes to method speak, it put its own label text and execute
       String greetings = ("hello my bike");
       sam.speak(greetings);
       
       int value  = 44;
       sam.jump(value);
	}

}