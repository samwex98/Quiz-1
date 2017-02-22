package quiz1;

import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many completions did the QB have? ");
		double COMP = input.nextDouble();

		System.out.print("How many passing attempts did the QB make? ");
		double ATT = input.nextDouble();

		System.out.print("How many yards did they pass? ");
		double YDS = input.nextDouble();

		System.out.print("How many touchdown passes did they make? ");
		double TDS = input.nextDouble();

		System.out.print("How many interceptions did they throw? ");
		double INT = input.nextDouble();

		double a = (COMP / ATT - .3) * 5;
		double b = (YDS / ATT - 3) * .25;
		double c = (TDS / ATT) * 20;
		double d = 2.374 - (INT / ATT * 25);

		System.out.println((a + b + c + d) / 6 * 100);
	}

}
