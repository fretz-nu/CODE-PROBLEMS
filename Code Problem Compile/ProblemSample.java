/***
Create a program that 
takes user input on what arithmetic operation problem and 
how many problems they want to solve

***/
import java.util.Scanner;

public class ProblemSample {

	public static void main(String[] args) {

		int retry = 0;
		Scanner input = new Scanner(System.in);

		do {
			Intro();
			System.out.println("Would you like to try again? 'Y' if yes, 'N' if not.");
			char opt = input.next().charAt(0);
			if (opt == 'Y' || opt == 'y') {
				retry += 0;
			} else if (opt == 'N' || opt == 'n') {
				retry += 1;
			} else {
				int i = 0;
				while (i < 1) {
					System.out.println("Invalid input. Enter 'Y' or 'N' only.\n");
					System.out.println("Would you like to try again? 'Y' if yes, 'N' if not.");
					char opt2 = input.next().charAt(0);
					if (opt2 == 'Y' || opt2 == 'y') {
						i += 1;
					} else if (opt2 == 'N' || opt2 == 'n') {
						i += 1;
						Exit();
					} else {
						i += 0;
					}

				}

			}

		} while (retry < 1);
		Exit();

	}

	static void Addition() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of problems you want to solve: ");
		int amount = input.nextInt();
		int correct = 0;
		for (int i = 0; i < amount; i++) {

			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);

			System.out.println(x + " + " + y + " = ?");
			int z = input.nextInt();
			if (z == (x + y)) {
				correct += 1;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Your score is: " + correct + "/" + amount);
	}

	static void Subtraction() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of problems you want to solve: ");
		int amount = input.nextInt();
		int correct = 0;
		for (int i = 0; i < amount; i++) {

			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);

			System.out.println(x + " - " + y + " = ?");
			int z = input.nextInt();
			if (z == (x - y)) {
				correct += 1;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Your score is: " + correct + "/" + amount);
	}

	static void Multiplication() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of problems you want to solve: ");
		int amount = input.nextInt();
		int correct = 0;
		for (int i = 0; i < amount; i++) {

			int x = (int) (Math.random() * 11);
			int y = (int) (Math.random() * 11);

			System.out.println(x + " * " + y + " = ?");
			int z = input.nextInt();
			if (z == (x * y)) {
				correct += 1;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Your score is: " + correct + "/" + amount);
	}

	static void Divide() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of problems you want to solve: ");
		int amount = input.nextInt();
		int correct = 0;
		for (int i = 0; i < amount; i++) {

			int x = (int) ((Math.random() * 11) + 10);
			int y = (int) (Math.random() * 11);

			System.out.println(x + " / " + y + " = ?");
			double xy = x / y;
			double z = input.nextDouble();
			if (z == xy) {
				correct += 1;
			} else {
				System.out.println("");
			}
		}
		System.out.println("Your score is: " + correct + "/" + amount);
	}

	static void Intro() {
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.println(
				"Welcome to Problem Solver Generator!\nPres 1. Addition\nPress 2. Subtraction\nPress 3. Multiplication\nPress 4. Division\nPress 5. Exit\nEnter Your choice: ");
		choice = input.nextInt();

		switch (choice) {
		case 1:
			Addition();
			break;
		case 2:
			Subtraction();
			break;
		case 3:
			Multiplication();
			break;
		case 4:
			Divide();
			break;
		case 5:
			Exit();
			break;
		default:
		}
	}

	static void Exit() {
		System.out.println("Thank you for using my program! - fretz");
		System.exit(0);
	}
}
