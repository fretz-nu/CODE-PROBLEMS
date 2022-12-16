package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddingNum {

	public static void main(String[] args) {
		BufferedReader objReader = null;
		try { // disregard this

			String strCurrentLine;

			objReader = new BufferedReader(
					new FileReader("src\\Untitled_1"));

			int sum = 0;
			
			while ((strCurrentLine = objReader.readLine()) != null) {

				// Split the lines into array.
				String[] stringArray = strCurrentLine.split(",");

				// Loop all elements in array.
				for (String num : stringArray) {
					System.out.println(num);

					
					// Convert string into integer.
					int temp = Integer.parseInt(num);
					
					
						if (temp % 3==0) {
							sum += temp;
						}
					
				
					
				}
			}

			System.out.println("sum: " + sum);
		} catch (IOException e) { // disregard this

			e.printStackTrace();

		}
	}
}
