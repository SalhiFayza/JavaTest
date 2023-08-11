package dpckg2;

public class TryCatch {

	public static void main(String[] args) {

		String[] names = { "java", "python" };
		try {

			// System.out.println(names[1]);

			System.out.println(names[3]);

		} catch (Exception e) {

			System.err.println(e.getMessage());
			
			//System.err.println("index array in names start 0 to 1 ");
		}
	}

}
