package Imp_Interview_programs;
import java.util.Scanner;
class Perfectno
{
	public static void main(String[] args)
	{
		perfectno();
	}
	public static void perfectno()
    {
	 Scanner sc = new Scanner(System.in);
     System.out.println("enter the values");
	 int a=sc.nextInt();
	 int sum=0;
	   for (int i=1;i<a;i++)
	   {			
	    if(a%i==0)
	    {
		 sum=sum+i;
	    }
	   }
	    if(sum==a)
	    {			
		 System.out.println("perfect no");
	    }
	    else
	    {
		 System.out.println("not perfect no");
	    }
	}
}
