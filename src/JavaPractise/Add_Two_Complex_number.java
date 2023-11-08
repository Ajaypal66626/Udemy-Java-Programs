package JavaPractise;

public class Add_Two_Complex_number {
	
	int real, image;
	
	public void complexNumber(int r, int i)
	{
		this.real=r;
		this.image=i;
		
	}
	 // function to print real number
    public void showC()
    {
        System.out.println(this.real + " +i " + this.image);
    }
 
    // we will implement  this function for addition
    public Add_Two_Complex_number add(ComplexNumber r1, ComplexNumber i2);
}
