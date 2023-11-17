package Imp_Interview_programs;
import java.util.Scanner;
public class Special_no {
		public static void main(String[] args)
		{
			specialno();
		}
		public static void specialno()
	    {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("enter the values");
		 int a=sc.nextInt();
		 int sum=0,temp=a,rem =0;
		 while(a>0)
		 {
			 int fact=1;
			 rem=a%10;
		   for (int i=rem;i>=1;i--)
		   {			
		     fact=fact*i;
		   }
			 a=a/10;
			 sum=sum+fact;
		 }
		 if(sum==temp)
		  {			
		   System.out.println("special no");
		  }
		  else
		  {
		   System.out.println("not special no");
		  }
		}
	}

	