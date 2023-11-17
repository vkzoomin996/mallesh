package Basic_Programs;

import org.testng.annotations.Test;

public class Basic_Programs {
	@Test
	public void swaptwono() {
		int a=10;
		int b=20;
		System.out.println(" before swaping the value of a is "+a);
		System.out.println(" before swaping the value of a is "+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println(" after swaping the value of a is "+a);
		System.out.println(" after swaping the value of a is "+b);
		
	}
	
	@Test
	public void swaptwonowithoutthird() {
		int a=10;
		int b=20;
		System.out.println(" before swaping the value of a is "+a);
		System.out.println(" before swaping the value of a is "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" after swaping the value of a is "+a);
		System.out.println(" after swaping the value of a is "+b);
		
	}
	@Test
	public void Outupt() 
	{
		System.out.println('A'+'B');
	}

	@Test
	public void Outupt1() 
	{
		System.out.println("Chandan"+15+35);
	}

}
