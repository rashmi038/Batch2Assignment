package rashmi.calculator;

import java.util.Objects;
import java.util.Scanner;

public class Calculators {

	static int calculator(Operations calculatorobject, int a, int b) {
		return calculatorobject.calculate(a, b);
	}

	public static void main(String args[]) {

		int a, b, c = 0;
		int operation;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = scanner.nextInt();
		System.out.println("enter b Value:");
		b = scanner.nextInt();
		System.out.println("Choices are here:");

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Percentage");
		System.out.println("6. Modulous");
		System.out.println("Enter Your Choice");
		operation = scanner.nextShort();

		// Operations calculatorobject = new Operations(a , b);

		switch (operation) {
		case 1:
			c = calculator(new Addition(), a, b);
			break;
		case 2:
			c = calculator(new Subtraction(), a, b);
			break;
		case 3:
			c = calculator(new Multiplication(), a, b);
			break;
		case 4:
			c = calculator(new Division(), a, b);
			break;
		case 5:
			c = calculator(new Modulus(), a, b);
		case 6:
			c = calculator(new Percentage(), a, b);
			break;
		}
		System.out.println("RESULT:" + c);
		scanner.close();
	}
//
//	static int getInt(Scanner scanner) {
//
//		return (int) scanner.nextDouble();

}
