package rashmi.Departments;

import java.util.Scanner;

class Operates extends Department {
	double BP, HRA;

	public Operates(int id, String name) {
		super(id, name);
	}

	void computepay() {
		System.out.println("Enter Basic Salary");
		Scanner scanner = new Scanner(System.in);
		BP = scanner.nextDouble();
		System.out.println("Enter HRA Allowance");
		HRA = scanner.nextDouble();

		Double TotalSalary;
		TotalSalary = BP + HRA;

		System.out.println("Salary Slip\n");
		System.out.println("department_id : " + department_id);
		System.out.println("department_name : " + department_name);
		System.out.println("Basic pay : " + BP);
		System.out.println("Housing Rent Allowance : " + HRA);
		System.out.println("TotalSalary : " + TotalSalary);
		scanner.close();
	}

}
