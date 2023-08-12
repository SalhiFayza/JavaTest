package dpckg;

public class MethodReturn {
	
	public static void info() {}
	
	public static int math(int x, int y) {
		
		return x + y ;
		// return x - y ;
		// return x * y ;
	}

	public static void main(String[] args) {
		
		// math(5, 2);
		
		System.out.println( math(5, 2) );
		

	}

}
