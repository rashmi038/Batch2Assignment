package rashmi;

import java.util.Scanner;

class Department {
	int department_id;
	String department_name;

	Department() {
	}

	Department(int id, String name) {
		this.department_id = id;
		this.department_name = name;
	}
}

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
