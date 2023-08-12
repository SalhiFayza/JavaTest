package dpckg2;

class Company {
	
	String info = "Full Stack";
	String year = "2023 - 09 - 12 | Tunisia";
}

class Cars{
	
	String car1, car2, car3;
}

class Employees{
	
	void Employe() {
		
		String name ="Fayza",
				job = "Full Stack",
				salary = "450$" ;
	    
	    System.out.println("Name is: " + name);
	    System.out.println("Job is: " + job);
	    System.out.println("Salary is: " + salary);
	}
	
	int math(int x, int y) {
		return x + y ;
	}
}

public class JavaOop {

	public static void main(String[] args) {

		/* 
		Company company = new Company(); // Object class Company (-_-)
		System.out.println(company.info);
		System.out.println(company.year);
		*/
		
		/*
		Cars cars = new Cars();// Object class Cars (-_-)
		cars.car1 = "BMW";
		cars.car2 = "Mercedes";
		cars.car3 = "Honda";
		
		System.out.println(cars.car2);
		*/
		
		
		Employees emp = new Employees();
		emp.Employe();
		
		System.out.println(emp.math(5, 2));

	}

}
