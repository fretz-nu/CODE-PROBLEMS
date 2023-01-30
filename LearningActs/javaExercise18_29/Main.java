package javaExercise18_29;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter a directory: ");
		        String directory = input.nextLine();
		        
		        File file = new File(directory);
		        if (file.isDirectory()) {
		            int count = 0;
		            for (File f : file.listFiles()) {
		                if (f.isFile()) {
		                    count++;
		                }
		            }
		            System.out.println("The number of files is " + count);
		        } else {
		            System.out.println("no such directory");
		        }
		    
		

	}

}
