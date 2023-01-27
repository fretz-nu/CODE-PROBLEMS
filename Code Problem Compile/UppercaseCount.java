import java.util.Scanner;
public class UppercaseCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a String: ");
		
		String word = input.nextLine();
		int i = 0;
		while (word.length()>i) {
			char letter = word.charAt(i);
			if (letter>='A' && letter>='Z') {
				count++;
			} i++;
		}
		
		System.out.println("The number of uppercase letters are: " + count);
	

	}

}
