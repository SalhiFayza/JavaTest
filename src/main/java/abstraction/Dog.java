package abstraction;

public class Dog extends Pets implements Animal, Speed{
    
	
	public void drink() {
		System.out.println("Dog is drinking");
	}
	
	public void walk() {
		System.out.println("Dog is walking");
	}
	public void run() {
		System.out.println("Dog is running");
	}

	@Override
	void shout() {
		
	}

}
