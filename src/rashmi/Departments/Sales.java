package rashmi.Departments;

import java.util.Scanner;

class Sales extends Department {
	double BP, Insentive;

	public Sales(int id, String name) {
		super(id, name);
	}

	void computepay() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		BP = scanner.nextDouble();
		System.out.println("Enter Insentive");
		Insentive = scanner.nextDouble();

		Double TotalSalary;
		TotalSalary = BP + Insentive;

		System.out.println("Salary Slip\n");
		System.out.println("department_id : " + department_id);
		System.out.println("department_name : " + department_name);
		System.out.println("Basic pay : " + BP);
		System.out.println("Insentives : " + Insentive);
		System.out.println("TotalSalary : " + TotalSalary);
	}
}
