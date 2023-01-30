package javaExercise12_13;
import java.io.*;
import java.util.Scanner;

public class Main {
     public static void main(String args []) throws IOException {
    	 Scanner sc = new Scanner(System.in);
    	 File file = new File(args[0]);
    	 System.out.println("Welcome to the file content counter system.");
    	 String fileContent;
    	 
    	 if(file.createNewFile()) {
    		 BufferedWriter writer = new BufferedWriter(new FileWriter(file));
    		 System.out.println("file initially doesnt exist so we created the file: " + file);
    		 System.out.println("Please enter content of the newly created file: ");
    		 fileContent = sc.nextLine();
    		 int maxWord = 20;
			 int currentWordCount = 0;
    		 for (String word : fileContent.split(" ")) {	 
    			 if (currentWordCount == maxWord) {
    				 writer.newLine();
    				 currentWordCount = 0;
    			 }
    			 writer.write(word + " ");
    		     currentWordCount++;
    		    
    		 }
    		 writer.close();
    		 System.out.println("Content succesfully saved.");
    		 System.out.println("counting the characther, words, and line count...");
    		 
    		 
    	 }   
    	 
    	 else if(file.exists()) {
    		 System.out.println("this File exist in our system");		 
    		 System.out.println("counting the characther, words, and line count...");
    	 }   
    	     System.out.println("results: ");
        	 getCharactherCount(file);
        	 getWordCount(file);
        	 getLineCount(file);
    	 
     }
     
     static void getCharactherCount(File file)  {
    	 try {
    	 BufferedReader reader = new BufferedReader(new FileReader(file));
    	 int characterCount = 0;
    	 String line = null;
         while ((line = reader.readLine()) != null) {
        	int whitespacesCount = line.split(" ").length;
           characterCount += line.length() - whitespacesCount ;
         }
         if(characterCount <= 1) {
        	    System.out.println(characterCount + " characther");
         }
         
         else{
        	 System.out.println(characterCount + " characthers");
         }
         reader.close();       
    	 }
    	 
    	 catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
     
     static void getWordCount(File file)  {
    	 try {
    	 BufferedReader reader = new BufferedReader(new FileReader(file));
    	 int wordCount = 0;
    	 String line = null;
    	 
    	 while((line = reader.readLine())!= null) {
    		 wordCount += line.split(" ").length;
    	 }
    	 if(wordCount <= 1) {
    		 System.out.println(wordCount + " word");
    	 }
    	 else {
    		 System.out.println(wordCount + " words");
    	 }
         reader.close();   
    	 }
    	 catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }
     
     
     static void getLineCount(File file) {
    	 try {
    	 BufferedReader reader = new BufferedReader(new FileReader(file));
    	 int lineCount = 0;
    	 int maxWord = 20;
    	 int currentWordCount = 0;
    	 String line = null;
    	 while((line = reader.readLine())!= null) {
    		  currentWordCount = line.split("").length;
    		  if(currentWordCount == maxWord) {
    			  lineCount++;
    		  }
    		 lineCount++;
    	 }
    	 if(lineCount <= 1) {
    		 System.out.println(lineCount + " line");	 
    	 }
    	 else {
    		 System.out.println(lineCount + " lines");
    	 }
         reader.close();     
    	 }
    	 catch(IOException e) {
    		 e.printStackTrace();
    	 }
     }   
    
}
