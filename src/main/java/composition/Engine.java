package composition;

public class Engine {
	private String type;
	private String power;

	public Engine() {
		super();
	}

	public Engine(String type, String power) {
		super();
		this.type = type;
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
