package JavaPractise;

import java.util.Scanner;

public class Read_and_Print_Intiger_Value {
public static void main(String[] args) {
	//Declare variable
	int num;
	//Enter Number
	System.out.println("Enter Number Value :" );
	
	//Create and Use Scanner for Scan entered value
	Scanner s=new Scanner(System.in);
	
	//Read text from Input string
	 num = s.nextInt();
	 
	 System.out.println("Entered integer is: "
             + num);
}
}
