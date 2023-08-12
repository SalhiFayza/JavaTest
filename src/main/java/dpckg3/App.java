package dpckg3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Employees emp = new Employees();
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String st1 = Input.nextLine();
		System.out.println("Enter your job: ");
		String st2 = Input.nextLine();
		System.out.println("Enter your salary: ");
		String st3 = Input.nextLine();

		emp.info(st1, st2, st3);

	}

}
