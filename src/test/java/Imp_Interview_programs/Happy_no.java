package Imp_Interview_programs;
import java.util.Scanner;
public class Happy_no {
		public static void main(String[] args)
		{
			happyno();
		}
		public static void happyno()
	    {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("enter the values");
		 int a=sc.nextInt();
		 int sum=0,rem =0;
		 while(a>9)
		 {
			 while(a>0)
		   {			
		     rem=a%10;
			 sum=sum+rem*rem;
			 a=a/10;
		   }
			 a=sum;
			 sum=0;
		 }
		 if(a==1)
		  {			
		   System.out.println("happy no");
		  }
		  else
		  {
		   System.out.println("not happy no");
		  }
		}
	}


	