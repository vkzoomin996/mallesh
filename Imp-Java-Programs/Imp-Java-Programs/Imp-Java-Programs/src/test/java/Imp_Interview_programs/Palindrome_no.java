package Imp_Interview_programs;
import java.util.Scanner;
public class Palindrome_no {
			public static void main(String[] args)
		{
			palindrome();
		}
		public static void palindrome()
	    {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("enter the values");
		 int a=sc.nextInt();
		 int rev=0,rem=0,temp=a;
		   while(a>0)
		   {			
		     rem=a%10;
			 rev=(rev*10)+rem;
			 a=a/10;
		   }
		    if(rev==temp)
		    {			
			 System.out.println("palindrome no");
		    }
		    else
		    {
			 System.out.println("not palindrome no");
		    }
		}
	}

	
