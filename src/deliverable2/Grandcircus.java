package deliverable2;

import java.util.Scanner;

public class Grandcircus {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter First word"); // Prompt User
		String firstWord = scanner.nextLine(); // Read user input
		System.out.println("Enter Second word");
		String secondWord = scanner.nextLine();

// Convert the string into a char array to enable you to loop through it and print out unicode
		for (char ch : firstWord.toCharArray()) {
			System.out.println(ch + ": " + (int) (ch));
		}

		for (char ch : secondWord.toCharArray()) {
			System.out.println(ch + ": " + (int) (ch));
		}

		// iterate through and sum each character
		int sum1 = 0;
		for (char ch : firstWord.toCharArray()) {
			sum1 += ((int) (ch));
		}

		System.out.println("The first word is " + firstWord + " and the second word is " + secondWord); // Output user
		// input

		System.out.println("The sum of the first word is " + sum1);

		int sum2 = 0;
		for (char ch : secondWord.toCharArray()) {
			sum2 += ((int) (ch));
		}
		System.out.println("The sum of the second word is " + sum2);

		System.out.println("The difference between the two words is " + (sum2 - sum1));

	}
}
