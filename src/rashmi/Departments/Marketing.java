package rashmi.Departments;

import java.util.Scanner;

class Marketing extends Department {
	double Salary, Insentive, TA;

	public Marketing(int id, String name) {
		super(id, name);
	}

	void computepay() {
		System.out.println("Enter Salary");
		Scanner scanner = new Scanner(System.in);
		Salary = scanner.nextDouble();
		System.out.println("Enter Insentive");
		Insentive = scanner.nextDouble();
		System.out.println("Enter Travel Allowance");
		TA = scanner.nextDouble();

		Double TotalSalary;
		TotalSalary = Salary + Insentive + TA;

		System.out.println("Salary Slip\n");
		System.out.println("department_id : " + department_id);
		System.out.println("department_name : " + department_name);
		System.out.println("Salary : " + Salary);
		System.out.println("Insentives : " + Insentive);
		System.out.println("Travel Allowance : " + TA);
		System.out.println("TotalSalary : " + TotalSalary);
	}

}
