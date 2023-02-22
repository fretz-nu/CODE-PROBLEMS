package javaExercise12_14;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*test text file is provided under the javaExercise12_14 directory, we also made an option for you to
  create your own text file that will also be created under the same directory.
*/
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("do you want to generate your own text file?(Y,N): ");
		String choice = sc.nextLine();	
		if(choice.equals("Y")){
			try {
				generateFile();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}	
		else if(choice.equals("N")) {
			System.out.print("enter file name: ");
			String fileName = sc.nextLine();
			File file = new File("src/javaExercise12_14/" + fileName);
			try {
				displayResults(file);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		
		}        
	}
	
	static void generateFile()throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter directory name: ");
		String fileName = sc.nextLine();
		File file =  new File("src/javaExercise12_14/" + fileName);
	    if(file.createNewFile()) {
	        
	    	System.out.println("enter scores (example 0 10 5 4) : " );
			String scores = sc.nextLine();
			String pattern = "^[\\d\\s]+$";
	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(scores);
	        if (m.find()) {
	        	BufferedWriter writer = new BufferedWriter(new FileWriter(file));
				writer.write(scores);
		    	writer.close();
		    	displayResults(file);
	        }         
	        else {
	        	System.out.println("invalid input, restarting file creation");
	        	file.delete();
	        	generateFile();
	        }
	    }  
	    else if(file.exists()) {
	    	System.out.println("filename already exist, please enter an unexisting file name.");
	    	generateFile();
	    }
	}
	
	static void displayResults(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		String content = ""; 
		while(line != null) {
			content += line;
			line = reader.readLine();
		}	
		String[] toConvert = content.split(" ");
		ArrayList<Integer> scores = new ArrayList<Integer>();
		int num = 0;
		for(int i = 0; i < toConvert.length; i++) {
			num = Integer.parseInt(toConvert[i]);
			scores.add(num);  
		}
		int total = 0;
		int average = 0;
		
		for (int i = 0; i < scores.size(); i++) {
			total += scores.get(i);
			average ++;
		}
		average = total/average;
		System.out.println("total score: " + total);
		System.out.println("average score: " + average);
	}

}
