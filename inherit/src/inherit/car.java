package inherit;

public class car extends machine{
	
	public void start ()
	{
		System.out.println("Machine startred by the child car");
	}
	
	
	
	
	@Override
	public void stop() {
		System.out.println("Machine stopped by the child car");
	}




	public void wipeWindShield () {
		
		System.out.println("wiping wind shied");
	}
	
	// machine is parent and car is derived from machine.
	// car is identical to machine.
	// car is child class, machine is the parent.
	// string class is final and can't be extended.
	// car method overrides the parent class method.

}
