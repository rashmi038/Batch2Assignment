package rashmi;

import java.util.Scanner;

public class BankTeleCaller {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainMenu();
	}

	private static void MainMenu() {
		System.out.println("Welcome to Your Bank,Please Choose the Below Option");
		System.out.println(
				" A.press 0 to exit\n B.press 1 for Loans\n C.press 2 for Savings\n D.press 3 for Current\n E.press 4 for cards\n");
		int input = sc.nextInt();

		switch (input) {
		case 0:
			System.out.println("Stop Processing");
			break;
		case 1:
			Loans();
			break;
		case 2:
			SavingsAccount();
			break;
		case 3:
			CurrentAccount();
			break;
		case 4:
			Cards();
			break;
		}
	}

	private static void Loans() {
		System.out.println(
				" A.press 1 for Personal loan\n B.press 2 for Home loan\n C.press 3 for Gold loan\n D.press 4 for Car loan\n E.press 9 to Go Back to Previous Menu");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("Thank you for Choosing Personal Loan");
			break;
		case 2:
			System.out.println("Thank you for Choosing Home Loan");
			break;
		case 3:
			System.out.println("Thank you for Choosing Gold Loan");
			break;
		case 4:
			System.out.println("Thank you for Choosing Car Loan");
			break;
		case 9:
			MainMenu();
			break;
		}
	}

	private static void SavingsAccount() {
		System.out.println("Please Enter Your Savings Account number:");
		String saving = sc.next();
		String regix = "\\d{8}";
		boolean result = saving.matches(regix);

		if (result) {
			System.out.println("Thank you for Account number..");
			System.out.println(
					" A.press 1 to show account balance\n B.press 2 to speak customer care\n C.press 9 to go back to previous menu\n");
			int y = sc.nextInt();

			switch (y) {
			case 1:
				System.out.println("Your Savings Account Balane is 500.00:");
				break;
			case 2:
				System.out.println("Customer care Number is 122133");
				break;
			case 9:
				MainMenu();
				break;
			}
		} else {
			System.out.println(" Invalid account number\n Press 0 to try again or Press 9 to Go Back to Previous Menu");
			int a = sc.nextInt();
			if (a == 0) {
				SavingsAccount();
			} else if (a == 9) {
				MainMenu();
			}
		}
	}

	private static void CurrentAccount() {
		System.out.println("Please Enter Your Current Account number:");
		String number = sc.next();
		String regix = "\\d{8}";
		boolean result = number.matches(regix);

		if (result) {
			System.out.println("Thank you for account number");
			System.out.println(
					" A.press 1 to show account balance\n B.press 2 to speak customer care\n C.press 9 to Go Back to Previous Menu\n");
			int current = sc.nextInt();

			switch (current) {
			case 1:
				System.out.println("Your Account balance is 5000.00:");
				break;
			case 2:
				System.out.println("Customer care Number is 122133");
				break;
			case 9:
				MainMenu();
				break;
			}
		} else {
			System.out.println(" Invalid account number\n Press 0 to try again or Press 9 to Go Back to Previous Menu");
			int b = sc.nextInt();
			if (b == 0) {
				CurrentAccount();
			} else if (b == 9) {
				MainMenu();
			}
		}
	}

	private static void Cards() {
		System.out.println("press 1 for credit card\n" + "press 2 for debit card\n");
		int card = sc.nextInt();

		switch (card) {
		case 1:
			CreditCard();
			break;
		case 2:
			DebitCard();
			break;
		}
	}

	private static void DebitCard() {
		System.out.println("Please Enter Your 16 digit Debit Card number:");
		String number = sc.next();
		String regix = "\\d{16}";
		boolean result = number.matches(regix); 

		if (result) {
			System.out.println("Thank you for account number");
			System.out.println(
					" A.press 1 to block your card\n B.press 2 to speak customer care\n C.press 9 to Go Back to Previous Menu\n");
			int debit = sc.nextInt();

			switch (debit) {
			case 1:
				System.out.println("Card is blocked:");
				break;
			case 2:
				System.out.println("Customer care Number is 122133");
				break;
			case 9:
				MainMenu();
				break;
			}
		} else {
			System.out.println(" Invalid account number\n Press 0 to try again or Press 9 to Go Back to Previous Menu");
			int c = sc.nextInt();
			if (c == 0) {
				DebitCard();
			} else if (c == 9) {
				MainMenu();
			}
		}
	}

	private static void CreditCard() {
		System.out.println("Please Enter Your 16 digit Credit Card number:");
		String number = sc.next();
		String regix = "\\d{16}";
		boolean result = number.matches(regix);

		if (result) {
			System.out.println("Thank you for account number");
			System.out.println(
					" A.press 1 to block your card\n B.press 2 to speak customer care\n C.press 9 to Go Back to Previous Menu\n");
			int credit = sc.nextInt();

			switch (credit) {
			case 1:
				System.out.println("Card is blocked:");
				break;
			case 2:
				System.out.println("Customer care Number is 122133");
				break;
			case 9:
				MainMenu();
				break;
			}
		} else {
			System.out.println(" Invalid account number\n Press 0 to try again or Press 9 to Go Back to Previous Menu");
			int d = sc.nextInt();
			if (d == 0) {
				CreditCard();
			} else if (d == 9) {
				MainMenu();
			}
		}
	}
}
