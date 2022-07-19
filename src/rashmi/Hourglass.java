package rashmi;

import java.util.Scanner;

public class Hourglass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		int nRows = sc.nextInt();

		// upper-half
		for (int i = 0; i < nRows / 2; i++) {
			for (int j = nRows - i; j < nRows; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < nRows - 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

        //lower-half
		for (int i = 0; i < (nRows + 1) / 2; i++) {
			for (int j = 1; j <= nRows / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
