package JavaPractise;

public class Find_greater_number_2 {
//Using If Else Condition
	
	static int BigestThreenumber(int x, int y, int z)
	{
		if(x>=y && x>=z)
			
		return x;
		
		else if (y>=x && y>=z)
			
			return y;
		
		else 
			
			return z;
		
	}
	
	public static void main(String[] args) {
		
		int a=10,b=12,c=21,large;
		
		large=BigestThreenumber(a,b,c);
		System.out.println(large + " is a greater number");
	}
}
