package Imp_Interview_programs;
import java.util.Scanner;
public class Swap_2nos {
		public static void swap() {
			Scanner sc = new Scanner (System.in);
		    System.out.println("enter the values of a");
		    int a = sc.nextInt();
		    System.out.println("enter the values of a");
		    int b = sc.nextInt();
		    int c;
			c=a;
			a=b;
			b=c;
			System.out.println(a);
			System.out.println(b);
		}

		public static void main(String[] args) {
	    swap();
		 }
	}

	