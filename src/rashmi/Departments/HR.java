package rashmi.Departments;

import java.util.Scanner;

class HR extends Department {
	double BP, Bonous;

	public HR(int id, String name) {
		super(id, name);
	}

	void computepay() {
		System.out.println("Enter Basic Salary");
		Scanner scanner = new Scanner(System.in);
		BP = scanner.nextDouble();
		System.out.println("Enter Bonous");
		Bonous = scanner.nextDouble();

		Double TotalSalary;
		TotalSalary = BP + Bonous;

		System.out.println("Salary Slip\n");
		System.out.println("department_id : " + department_id);
		System.out.println("department_name : " + department_name);
		System.out.println("Basic pay : " + BP);
		System.out.println("Bonous : " + Bonous);
		System.out.println("TotalSalary : " + TotalSalary);
	}
}
