package dpckg4;

class Test2 {
	String name = "Java";
	String work = "Full Stack";
}

class Test3 extends Test2{
	
}

public class Test1 {

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		
		System.out.println(test2.name);
		
		//************
		
		Test3 test3 =  new Test3();
		System.out.println(test3.work);
		

	}

}
