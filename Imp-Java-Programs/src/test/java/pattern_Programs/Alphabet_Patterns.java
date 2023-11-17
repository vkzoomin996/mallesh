package pattern_Programs;

import org.testng.annotations.Test;

public class Alphabet_Patterns {
	@Test
	public void pattern1() {
//		A B C D E 
//		F G H I J 
//		K L M N O 
//		P Q R S T 
//		U V W X Y 
		int n=5;
		char ch ='A';
		for (int i=1; i<=n; i++) 
		{
			for (int j=1; j<=n; j++) 
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern2() {
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 		

		int n=5;
		for (int i=1; i<=n; i++) 
		{
			char ch ='A';
			for (int j=1; j<=n; j++) 
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
