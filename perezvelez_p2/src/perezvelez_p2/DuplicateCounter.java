package perezvelez_p2;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class DuplicateCounter {
	String[] wordCounter = new String[99];
	int a = 0;
	int b = 0;
	
	public void count(String dataFile) throws IOException{
		int count;
		String input;
		HashMap<String, Integer> wordnum = new HashMap<String, Integer>();
		FileInputStream fileByteStream = null;
	    Scanner inFS = null;
		 
	    fileByteStream = new FileInputStream("problem2.txt");
	    inFS = new Scanner(fileByteStream);
	    
	    while (inFS.hasNext()) {
	    	input = inFS.next();
	    	if (wordnum.containsKey(input) == true) {
	    		wordnum.put(input, (wordnum.get(input) + 1));
	    	}
	    	
	    	if (wordnum.containsKey(input) == false) {
	    		wordnum.put(input, 1);
	    		wordCounter[a] = input;
	    		a += 1;
	    	}
	    	
	    }
	    
	    while (b < a) {
	    	wordCounter[b] = wordCounter[b] + " " + wordnum.get(wordCounter[b]);
	    	b += 1;
	    }
	    
	    b = 0;
	    
	}
	
	public void write(String outputFile) throws IOException{
		 FileOutputStream fileByteStream = null; 
	     PrintWriter outFS = null;
	     
	     fileByteStream = new FileOutputStream("unique_word_counts.txt");
	     outFS = new PrintWriter(fileByteStream);
	     
	     while (b < a) {
	    	 outFS.println(wordCounter[b]);
	    	 b += 1;
	     }
	     outFS.flush();
	     fileByteStream.close();
		 
	 }

}




