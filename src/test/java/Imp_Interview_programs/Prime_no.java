package Imp_Interview_programs;
import java.util.Scanner;
public class Prime_no {
public static void main(String[] args)
	 	{
	 		primeno();
	 	}
	 	public static void primeno()
	     {
	 	 Scanner sc = new Scanner(System.in);
	      System.out.println("enter the values");
	 	 int a=sc.nextInt();
	 	 int count=0;
	 	   for (int i=1;i<=a;i++)
	 	   {			
	 	    if(a%i==0)
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
	 }
