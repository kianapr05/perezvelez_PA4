package perezvelez_p1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class DuplicateRemover {
	String[] uniqueWords = new String[99];
	int b = 0;
	
	 public void remove(String dataFile) throws IOException{
		 HashSet<String> unique = new HashSet<String>();
		 boolean addResult;
		 FileInputStream fileByteStream = null;
	     Scanner inFS = null;
		 
	     fileByteStream = new FileInputStream("problem1.txt");
	     inFS = new Scanner(fileByteStream);
	     
	     int a = 0;
	     
	     while (inFS.hasNext()) {
	    	 String input = inFS.next();
	    	 
	    	 addResult = unique.add(input);
	    	 if (addResult == true) {
	    		 uniqueWords[a] = input;
	    		 a += 1;
	    		 b += 1;
	    	 }
	     }
	     
	     fileByteStream.close();

	 }
	 
	 public void write(String outputFile) throws IOException{
		 FileOutputStream fileByteStream = null; 
	     PrintWriter outFS = null;
	     
	     fileByteStream = new FileOutputStream("unique_words.txt");
	     outFS = new PrintWriter(fileByteStream);
	     int a = 0;
	     
	     while (a < b) {
	    	 outFS.println(uniqueWords[a]);
	    	 a += 1;
	     }
	     outFS.flush();
	     fileByteStream.close();
		 
	 }

}
