package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		BufferedReader objReader = null;
		
		try { // disregard this

			String strCurrentLine;

			objReader = new BufferedReader(new FileReader(
					"src\\input_file.txt"));

			int line_counter = 0;
			while ((strCurrentLine = objReader.readLine()) != null) {

				line_counter++;
				System.out.println("line " + line_counter + ": " + strCurrentLine);
			}

		} catch (IOException e) { // disregard this
System.out.println("Error! wrong file path");
			System.out.println("Enter a proper file location.");

		}
		finally {
			System.out.println("Resetting program...");
		}
	}

}