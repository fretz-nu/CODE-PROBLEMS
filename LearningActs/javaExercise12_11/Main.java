package javaExercise12_11;

import java.io.*;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		    String stringToRemove = args[0];
			java.io.File fileName = new java.io.File(args[1]);
			
			if(fileName.createNewFile()){
			
				System.out.println("File initially doesn't exist so we created " + fileName.getName());
				BufferedWriter writeName = new BufferedWriter(new FileWriter(fileName));	
			    writeName.write("John Miguel John Miguel John Miguel");
				writeName.close();		
			}
			
		
			
			 BufferedReader br  = new BufferedReader(new FileReader(fileName));
	 
	        // Declaring a string variable
	        String st;
	        String updatedLine = "";
	        // Condition holds true till
	        // there is character in a string
	        while ((st = br.readLine()) != null) {
	        	System.out.println("initial text file content: " + st);
	        	updatedLine = st.replaceAll(stringToRemove, "");
	        }
	   
	        BufferedWriter writeUpdatedContent = new BufferedWriter(new FileWriter("names.txt"));
		    writeUpdatedContent.write(updatedLine);
			writeUpdatedContent.close();		
			System.out.println("updated file content: " + updatedLine);
	             
	}

}
