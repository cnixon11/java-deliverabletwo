package deliverable2;

import java.util.Scanner;

public class Grandcircus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String string1 = "Chris";
		String string2 = "Nixon";

		System.out.print("The sum of " + string1 + " is: ");
		System.out.println((int) 'C' + 'h' + 'r' + 'i' + 's');
		System.out.print("The sum of " + string2 + " is: ");
		System.out.println((int) 'N' + 'i' + 'x' + 'o' + 'n');

		System.out.print("The difference of the absolute value of " + string1 + " " + string2 + " is: ");
		System.out.println((int) ('N' + 'i' + 'x' + 'o' + 'n') - ('C' + 'h' + 'r' + 'i' + 's'));

	}
}
