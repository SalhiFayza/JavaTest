package constructors;

public class Car {
	// Attributes
	int speed;
	String color;
	String model;
	boolean isHatchBack;

	// Default constructor
	public Car() {

	}

	// Constructor with model
	public Car(String model) {
		this.model = model;
	}
	
	// Constructor with parameters
	public Car(boolean isHatchBack, int speed) {
		
		this.isHatchBack = isHatchBack;
		this.speed = speed;
		
	}

}
