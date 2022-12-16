import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in)
;
	char choice = 'Y';
	do {
	System.out.println("Enter 1st integer: ");
	
		int x = input.nextInt();
		System.out.println("Enter 2nd integer: ");
		int y = input.nextInt();
		
		if (y==0) {
			throw new ArithmeticException ("y cannot be equals to 0");
		}
if (y!=0) {
	System.out.println("Your quotient is:  " + x / y);
	System.out.println("Do you want to continue? [Y][N] ");
	choice = input.next().charAt(0);
}
	} while(choice=='Y' || choice== 'y');
	
	if (choice=='N'|| choice =='n') {
		input.close();
		System.exit(0);
	}
	}

}
