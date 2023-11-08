package JavaPractise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Program_for_BufferReader {
	public static void main(String[] args)
			throws IOException {

		System.out.println("Enter Name: ");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		 // Reading data using readLine
        String name = reader.readLine();
 
        // Printing the read line
        System.out.println("Entered Name Is: " +name);
		
	}

}
