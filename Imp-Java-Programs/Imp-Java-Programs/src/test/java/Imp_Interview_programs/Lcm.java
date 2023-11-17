package Imp_Interview_programs;
import java.util.Scanner;
public class Lcm {
		public static void main(String[] args)
		{
			lcm();
		}
		public static void lcm()
	    {
		 Scanner sc = new Scanner(System.in);
	     System.out.println("enter a values");
		 int a=sc.nextInt();
		 System.out.println("enter b values");
		 int b=sc.nextInt();
		 int lcm=(a>b)?a:b;
		 while(true)
		 {
		 if(lcm%a==0&&lcm%b==0)
		  {			
		   System.out.println("the lcm of two nos is "+  lcm);
		   break;
		  }
		  lcm++;
		 }	  
		}
	}

	