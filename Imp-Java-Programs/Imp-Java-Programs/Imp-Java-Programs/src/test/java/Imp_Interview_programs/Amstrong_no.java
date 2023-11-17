package Imp_Interview_programs;
import java.util.Scanner;
public class Amstrong_no { 
	 	public static void main(String[] args)
	 	{
	 		armstrno();
	 	}
	 	public static void armstrno()
	     {
	 	 Scanner sc = new Scanner(System.in);
	      System.out.println("enter the values");
	 	 int a=sc.nextInt();
	 	 int sum=0,rem=0,temp=a;
	 	  for(int i=1;i<=a;i++)
	 	   {
	 		  while(a>0)
	 		  {
	 	       rem=a%10;
	 		   sum=sum+rem*rem*rem;
	 		   a=a/10;
	 		  }
	 	    if(sum==temp)
	 	    {
	 		 System.out.println("num is armstr ");
	 	    }
	 	    else
	 	    {
	 		 System.out.println("num is not armstr ");
	 	    }
	 	   }
	 	}
	 }
	 		 
	