package perezvelez_p1;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Application {
	public static void main(String[] args) throws IOException {
		
		DuplicateRemover file=new DuplicateRemover();
		file.remove("problem1.txt");
		file.write("problem1.txt");
	}

}
