package Imp_Interview_programs;
import java.util.Scanner;

import org.testng.annotations.Test;
public class Fibonacci_series {
		@Test
		public void fibonacci()
		{
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter a values");
		  int a =sc.nextInt();
		  System.out.println("enter b values");
		  int b=sc.nextInt();
		  int sum=0;
		  for(int i=0;i<=10;i++)
		  {
			  sum=a+b;
			  a=b;
			  b=sum;
			  System.out.println("the fibonacci num are"+ sum);
		  }    
		}
		@Test
		public void fibonacciDivisibleBy3and5()
		{
		  Scanner sc =new Scanner(System.in);
		  System.out.println("enter a values");
		  int a =sc.nextInt();
		  System.out.println("enter b values");
		  int b=sc.nextInt();
		  int sum=0;
		  for(int i=0;i<=10;i++)
		  {
			  sum=a+b;
			  a=b;
			  b=sum;
			  //System.out.println("the fibonacci num are"+ sum);
		  }    
		  if(sum%3==0&&sum%5==0) {
			  System.out.println("the fibonacci num are"+b);
		  }
		}
	}

	