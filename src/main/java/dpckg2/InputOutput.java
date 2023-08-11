package dpckg2;
import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		//**************** String ====> nextLine()
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Your name is: " +  name);
		*/
		
		//**************** Number ====> nextInt()
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int numb1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int numb2 = input.nextInt();
        System.out.println(numb1 + numb2);
	}

}
