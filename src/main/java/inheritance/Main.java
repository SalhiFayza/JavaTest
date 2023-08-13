package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Boy boy = new Boy();
		boy.setName("Anis");
		boy.setHeadMilitaryService(true);
		// System.out.println(boy.isHeadMilitaryService());
		boy.eat();
		String helloBoy = boy.sayHello();
		System.out.println(helloBoy);
		
		Girl girl = new Girl();
		girl.setName("Fayza");
		// System.out.println(girl.getName());
		String hello = girl.sayHello();
		System.out.println(hello);
	}

}
