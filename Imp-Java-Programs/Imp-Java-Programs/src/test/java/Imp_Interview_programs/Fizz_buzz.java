package Imp_Interview_programs;
import java.util.Scanner;
public class Fizz_buzz {
		public static void main(String[] args) {
			fizzbuzz();
		}
		public static void fizzbuzz() {
			Scanner sc = new Scanner (System.in);
		    System.out.println("enter the range ");
		    int n = sc.nextInt();
		    int fizzcount=0,buzzcount=0,fizzbuzzcount=0;
			for (int i=1;i<=n;i++ )
			{
	          if(i%3==0)
				{
				 System.out.println("fizz");
				 fizzcount++;		 
				}
				else if (i%5==0)
				{
				System.out.println("buzz");
				buzzcount++;
				}
			
			  else if (i%3==0&&i%5==0)
			    {
				System.out.println("fizzbuzz");
				fizzbuzzcount++;
			    }
			 else
				{ 
				System.out.println(i);
				}  
			}
			 System.out.println("fizz :"+fizzcount);
	 		 System.out.println("buzz :"+buzzcount);
	 		 System.out.println("fizzbuzz :"+fizzbuzzcount);
			 
		}
	}

	