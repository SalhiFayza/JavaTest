package composition;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		car.setColor("Blue");
		System.out.println(car.getColor());
		
		System.out.println("****____****");
		
		Engine e = new Engine("Germany","120");
		car.setEngine(e);
		
		System.out.println(car.getEngine().getPower());
		System.out.println(car.getEngine().getType());

		System.out.println("****____****");

		Engine e1 = new Engine();
		e1.setType("fayza");
		Car car1 = new Car("BMW", "white",  2, e1);
	    System.out.println(car1.getEngine().getType());	
	}

}
