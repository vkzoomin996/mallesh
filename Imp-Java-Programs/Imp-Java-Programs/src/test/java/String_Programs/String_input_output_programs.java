package String_Programs;

import org.testng.annotations.Test;

public class String_input_output_programs {
	/**
	 * output should be like aaabbcdd
	 */
	@Test
	public void FetchCharactersstring() {
		String str = "a3b2c1d2";
		char[] ch=str.toCharArray();
		for (int i = 0; i<ch.length;i=i+2) 
		{
			for(int j=0;j<ch[i+1]-48;j++)
			{
				System.out.println(" The characters in the string are :" + ch[i] );
			}	
		}	
	}
	
	@Test
	public void StringAdd() {
		String s="abcde";
		String s1="1234";
		String s2=s.concat(s1);
		for(int i=0;i<=s2.length();i=i+2) {
			System.out.println(s2.charAt(i));
		}
	}
	
}
