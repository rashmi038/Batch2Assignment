package rashmi.Departments;

public class DepartmentMain {

	public static void main(String[] args) 
	{
		Sales s = new Sales(1, "Sales");
		System.out.println("-----Sales-----");
		s.computepay();

		Marketing m = new Marketing(2, "Marketing");
		System.out.println("-----Marketing-----");
		m.computepay();

		HR hr = new HR(3, "HR");
		System.out.println("-----HR-----");
		hr.computepay();

		Operates op = new Operates(4, "Operates");
		System.out.println("-----Operates-----");
		op.computepay();

	}
}
