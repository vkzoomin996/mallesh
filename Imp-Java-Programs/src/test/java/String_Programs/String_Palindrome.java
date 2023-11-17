package String_Programs;

import org.testng.annotations.Test;

public class String_Palindrome {
	@Test
	public void PalindromeString() {
		String s="madam";
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev =rev + s.charAt(i);
		}
		if(rev.equals(s)) 
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}
	}

}
