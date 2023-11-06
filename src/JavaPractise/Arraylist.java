package JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		a.add("Ajay");
		a.add("Rahul");
		a.add("Sohan");
		a.add("Mayank");
		//System.out.println(a.remove(1));
		//System.out.println(a.get(3));
	 
	  for(int i=0; i<a.size(); i++)
	  {
		  
		System.out.println(a.get(i));
	  }
	  System.out.println("###########");
	  
	  for(String val: a)
	  {
		System.out.println(val);
	  }
	  //// Item is present in Array List
	  System.out.println("-------------------");
	   System.out.println(a.contains("Sohan"));
	   System.out.println("************");
	   
	   //// Convert String to Array List
	   
	   String[] g_name = {"Pihu", "Khusi","Muskan","Chanchu"};
	   List<String> baby_name=Arrays.asList(g_name);
	   System.out.println(baby_name.contains("Pihu"));
	   
	  
	}

}
