package pattern_Programs;

import org.testng.annotations.Test;

public class Star_Patterns {
	@Test
	public void pattern1() {
		// * * * * * *
		// * * * * * *
		// * * * * * *
		// * * * * * *
		// * * * * * *
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j=1; j<=n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void pattern2() {
		// *
		// * *
		// * * *
		// * * * * 
		// * * * * * 
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void pattern3() {
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	@Test
	public void pattern4() {
		//         *
		//       * *
		//     * * *
		//   * * * *
		// * * * * *
		int n = 5;
		for (int i=1; i<=n; i++)
		{
			for (int j=i; j<n; j++) 
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	@Test
	public void pattern5() {
		// * * * * *       
		//   * * * * 
		//     * * *
		//       * *
		//         * 
		int n = 5;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<i; j++) 
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void pattern6() {
		//     *     
		//    * *
		//   * * *  
		//  * * * *     
		// * * * * *
		/*int n = 5;
		for (int i=n; i>0; i--)
		{
			for (int j=1; j<=n; j++) 
			{
				if(i<=j)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();*/
			
			int n = 5;
			for (int i=1; i<=n; i++) 
			{
				for (int j=i; j<n; j++) 
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}

	@Test
	public void pattern7() {    
		// * * * * *
	    //  * * * * 
		//   * * *
        //	  * *
       //	   *     	
		int n = 5;
		for (int i=n; i>0; i--)
		{
			for (int j=n; j>=1; j--) 
			{
				if(i>=j)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}	
}