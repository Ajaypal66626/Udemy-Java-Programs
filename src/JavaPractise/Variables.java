package JavaPractise;

public class Variables {
	
	public static void main(String[] args)
	{
	     int id=149;
	     float salary = 40000;
	     String name= "Ajay Pal Singh Gour";
	     char nickname= 'A';
	     double mobile= 769726662;
	     
System.out.println("my id is a " + id );	
		
//Array
	//1st way to initialize array
	int[] arr=new int[5];
	arr[0]=1;
	arr[1]=11;
	arr[2]=111;
	arr[3]=1111;
	arr[4]=11111;
    
	for(int i=0; i<arr.length; i++)
		
	{
		System.out.print(arr[i]);
		System.out.print("\n");
	}	
	
	// 2nd way to initialize array
	int[] arr2= {2,22,222,2222,22222};
      for (int j=0; j<arr2.length; j++)
	   {
		 System.out.print(arr2[j]);
		 System.out.print("\n");
	   }
      
      // Enhance Array
      String[] names= {"Ajay", "Rahul", "Sohan", "Mayank", "Kapil", "Sudhanshu"};
      for(String n:names) 
      {
    	  System.out.println(n);
      }
      
      
      ///// For Loop with if else condition
      
      int[] arra= {1,2,3,4,6,10,13,15,17,19,22,28,38,40,50,};
      
      for(int k=0; k<arra.length;k++)
      {
    	  if(arra[k]%2 == 0)
    	  {
    		  System.out.println(arra[k]);
    	     //break;
    	  }
    	 else
    	  {
    		  System.out.println(arra[k]+ " not devide by 2");
    		  
    	  }
    	 
      }
      
	}		

}

