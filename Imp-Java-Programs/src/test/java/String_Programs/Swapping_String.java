package String_Programs;

import org.testng.annotations.Test;

public class Swapping_String {
	@Test
	public void swapFirstLastWordsString() {
		String str="I am from TestYantra";
		String []s=str.split(" ");
		String temp=s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		for(int i=0;i<s.length;i++) 
		{
			System.out.println(s[i]);
		}
	}

}
