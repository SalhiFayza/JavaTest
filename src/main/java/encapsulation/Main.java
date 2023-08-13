package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setspeed(300);
		
		// System.out.println(car1.getspeed());
		
		
		Car myBmw = new Car();
		myBmw.setspeed(300);
		myBmw.setColor("Red");
		myBmw.setModel("2050");
		myBmw.setHatchBack(false);
		
		// System.out.println(myBmw);
		
		System.out.println(myBmw.isHatchBack());
		System.out.println(myBmw.getColor());
	}

}
