package perezvelez_p2;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Application {
	public static void main(String[] args) throws IOException {
		
		DuplicateCounter file=new DuplicateCounter();
		file.count("problem2.txt");
		file.write("problem2.txt");
	}

}
