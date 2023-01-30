/***  Write a program that prompts the user to read
two integers and displays their sum. Your program should prompt the user to
read the number again if the input is incorrect
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoIntSum {
    public static void main(String[] args) {
        int x, y;
        boolean inputMismatch = false;

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter two integers: ");

            try {
                x = in.nextInt();
                y = in.nextInt();

                System.out.print("Sum = " + (x + y));
                inputMismatch = false;

            } catch (InputMismatchException ime) {
                inputMismatch = true;

                System.out.println("Wrong input. Try again: ");
                in.nextLine();
            }
        } while (inputMismatch);

        in.close();
    }
}