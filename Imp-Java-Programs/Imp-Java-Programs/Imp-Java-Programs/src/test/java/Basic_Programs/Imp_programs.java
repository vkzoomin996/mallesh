package Basic_Programs;

import org.testng.annotations.Test;

public class Imp_programs {
	@Test
	public void factorialOfNum() {
		int n=5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact =fact*i;
		}
		System.out.println(fact);
	}
	
//Fibonacci series------------------------------------------------
	@Test
	public void fibonacciSeries() {
		int sum=0,a=0,b=1;
		System.out.println("the fibonacci num are"+ a);
		System.out.println("the fibonacci num are"+ b);
		  for(int i=0;i<=10;i++)
		  {
			  sum=a+b;
			  a=b;
			  b=sum;
			  System.out.println("the fibonacci num are"+ sum); 
		  }  
	}
//Print nos in proper format---------------------------------------	
	@Test
	public void printNosInTheProperFormat() { // 1,3,5,15,31,63,127
		int n=1;
		for(int i=0;i<=6;i++) 
		{
			System.out.println(n);
			n=(n*2)+1;
		}
	}
	
// prime no or not--------------------
	@Test
	public void checkingPrimeNo()
	{
		int n=7;
	 	 int count=0;
	 	   for (int i=1;i<=n;i++)
	 	   {			
	 	    if(n%i==0)
	 	    {
	 		 count++;
	 	    }
	 	   }
	 	    if(count==2)
	 	    {			
	 		 System.out.println("prime no");
	 	    }
	 	    else
	 	    {
	 		 System.out.println("not prime no");
	 	    }
	}
//Primes no between the range 1-30-------------------------------
	@Test
	public void PrimeNoBetweenTheRange() {
		int range=30;
		for(int i=1;i<=range;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++) 
			{
				if(i%j==0)
				{
					count++;
				}	
			}
			if(count==2) 
			{
				System.out.println(i);
			}
		}	
	}
	@Test
	public void EvenNoBetweenTheRange() {
		int range=20;
		int count=0;
		for(int i=1;i<=range;i++)
		{
				if(i%2==0)
				{
					System.out.println(i);
					count++;
				}	
		}	
		System.out.println("The count of prime nos are: "+ count);
	}
//Fecthing Primes nos in an array-----------------------------------------------
	@Test
	public void fecthPrimeNosInArray() {
		int a[]= {91,66,26,33,51};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0) 
			{
				System.out.println("the even elements in an array :"+a[i]);
			}
	    }	
	}
}

