package encapsulation;

public class Car {
	
	private int speed;
    private String color;
    private String model;
    private boolean isHatchBack;
    

	public void setspeed(int speed) {
		this.speed = speed;
	}
	
	public int getspeed() {
		return speed;
		}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isHatchBack() {
		return isHatchBack;
	}

	public void setHatchBack(boolean isHatchBack) {
		this.isHatchBack = isHatchBack;
	}
	
	
	}
