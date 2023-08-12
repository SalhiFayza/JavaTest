package dpckg;

public class MethodVoid {

	public static void welcome() {
		
		System.out.println("JAVA");
		String fname = "Python";
		String lname = "PHP";
		System.out.println(fname + " " + lname);
	}
	
	public static void info(String name, String work) {
		
		System.out.println(name + " " + work);
		
	}

	public static void main(String[] args) {
		
		welcome();
		info("Fayza", "Full Stack");

	}

}
