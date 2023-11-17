package Imp_Interview_programs;

import java.util.Scanner;

public class Alternate_prime_nos {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		    System.out.println("enter the strating range value");
		 	int a=sc.nextInt();
		 	System.out.println("enter the ending range value");
			int b=sc.nextInt();
	 		primeno(a,b);		
	 	}
	 	public static void primeno(int a,int b)
	     {
	 	 
	 	    for (int i=a;i<=b;i++)
	 	    {
	 	      int count=0;
	 	      for(int j=2;j<=i/2;j++)
	 	      {
	 	        if(i%j==0)
	 	        {
	 		     count++;
	 	        }
	 	     }
	 	    if(count==0)
	 	    {	
	 	    	if(count%2==0)
	 	    	{
	 		     System.out.println("the alternative prime nos between 1 to 20 are:"+ i);
	 		     count++;
	 	    	}
	 	    }
	 	  }
	 	}
	 }
