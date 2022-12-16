package file_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TickTackToe {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader objReader = null;
		try { // disregard this

			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("src\\TestCase"));

			int astCount = 0;
			char[] text = {};
			while ((strCurrentLine = objReader.readLine()) != null) {

				
				String[] stringArray = strCurrentLine.split("");

				
				for (String letter : stringArray) {
					System.out.println(letter);

					for (int i = 0; i < letter.length(); i++) {
						text = letter.toCharArray();
					}
					

				}
			}

			System.out.println("Checker: " + astCount);
		} catch (IOException e) { // disregard this

			e.printStackTrace();

		}

	}
}
