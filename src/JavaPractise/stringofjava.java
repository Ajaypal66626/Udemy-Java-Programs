package JavaPractise;

public class stringofjava {
	public static void main(String[] args)
	{
		//// string is traditionally a sequence of characters, either as a literal constant or as some kind of variable. The latter may allow its elements to be mutated and the length changed, or it may be fixed.
		
		// Initialize literal 
		String s= "Ajay Pal Singh Gour";
		
		// Initialize with new operator
		String s1=new String("Vijay Singh Gour");
		System.out.println(s1);
		
		//Split string
		String[] splitstring= s1.split("Singh");
	    System.out.println(splitstring[0]);
		System.out.println(splitstring[1]);
		
		System.out.println("///////////");
		
		// For Remove Space we use trim operation
		System.out.println(splitstring[1].trim());
		
		System.out.println("##############");
		
		// For print One by One Character
		for(int i=0; i<s1.length(); i++)
		{
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("**************");
		
		// Reverse String
          for (int j=s1.length()-1; j>=0; j--)
          {
        	  System.out.println(s1.charAt(j));
          }
		//
        
	}
}
