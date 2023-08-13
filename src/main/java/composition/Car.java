package composition;

public class Car {
	private String model;
	private String color;
	private int doors;
	// car has a engine
	private Engine engine;
	

	public Car() {
	}

	public Car(String model, String color, int doors, Engine engine) {
		super();
		this.model = model;
		this.color = color;
		this.doors = doors;
		this.engine = engine;
	}

	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

}
