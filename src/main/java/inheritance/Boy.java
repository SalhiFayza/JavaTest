package inheritance;

public class Boy extends Person {

	private boolean headMilitaryService;

	public boolean isHeadMilitaryService() {
		return headMilitaryService;
	}

	public void setHeadMilitaryService(boolean headMilitaryService) {
		this.headMilitaryService = headMilitaryService;
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("as a boy");
	}
}
