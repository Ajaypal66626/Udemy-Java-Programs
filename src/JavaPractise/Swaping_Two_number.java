package JavaPractise;

public class Swaping_Two_number {
public static void main(String[] args) {
	int a=5;
	int b=9;
	int c;
	
	c=a;
	a=b;
	System.out.println("Swapin numer of A is :" + a);
	b=c;
	System.out.println("Swapin numer of B is :" + b);
	
	//
	 
	
}
static void swapValuesUsingThirdVariable(int m, int n)
{
    // Swapping the values
    int temp = m;
    m = n;
    n = temp;
    System.out.println("Value of m is " + m
                       + " and Value of n is " + n);
}
}
