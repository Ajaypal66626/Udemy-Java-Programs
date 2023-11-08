package JavaPractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Find_greater_number_3 {
public static void main(String[] args) {
	
	int a,b,c;
	a=10;
	b=20;
	c=50;
	
	ArrayList<Integer> x = new ArrayList<>();
	x.add(a);
	x.add(b);
	x.add(c);
	
	System.out.println(Collections.max(x) + " is greater number");
}
}
