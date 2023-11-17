package Imp_Interview_programs;
import java.util.Scanner;
class Perfect_sqr
{
	public static void persquare()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value ");
		int a =sc.nextInt();
		int count=0;
		for(int i=1;i<=a;i++)
		{                             
		  if(i*i==a)
		   {
			count++;	
		   }
		}
		  if(count==1)
		  {
			   System.out.println("num is perfect square");
		  }
		  else
		  {
			   System.out.println("num is not perfect sqaure");
		  }
	}
	public static void main(String[] args) 
	{
		persquare();
	}
}


