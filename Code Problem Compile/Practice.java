
/*** Summing Elements in Arrays

You are given a program that takes the length of the array as the first input, creates it, 
and then takes the next inputs as elements of the array.

Complete the program to go through the array and calculate the sum of the numbers that are 
multiples of 4.

***/
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		int num;
		int sum = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Length of array: ");
		num = input.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Input your integers.");

			arr[i] = input.nextInt();
		}
		for (int j = 0; j < num; j++) {
			if ((arr[j] % 4) == 0) {
				sum += arr[j];
			}
		}
		System.out.println("SUM IS: " + sum);
	}
}
