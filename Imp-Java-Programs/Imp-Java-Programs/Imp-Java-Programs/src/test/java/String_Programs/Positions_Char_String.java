package String_Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Positions_Char_String {
	@Test
	public void positionStringUsingCollection() {
		String str="tester";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=s.length()-1;i>=0;i--) 
		{
			set.add(s.charAt(i));
		  for (Character ch : set) 
		  {
			if(ch==s.charAt(i))
			{
				System.out.println(ch +" Is In "+(i+1)+" position ");
			}
			
		}
	}
}
	
	@Test
	public void positionStringUsingMap() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for(int i=0;i<s.length();i++) 
		{
			map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m : map.entrySet()) 
		{
			for(int i=0;i<s.length();i++) 
			{
				if(m.getKey()==s.charAt(i)) 
				{
					System.out.println(m.getKey() +" Is In "+(i+1)+" position ");
				}
			}	
        }
    }
	
// print position of each string character in reverse order	using collection------------------
			@Test
			public void positionStringInReverseUsingCollection() {
				String str="tester";
				String s=str.toLowerCase();
				LinkedHashSet<Character> set = new LinkedHashSet<Character>();
				for(int i=0;i<s.length();i++) 
				{
					set.add(s.charAt(i));
				}
				  for (Character ch : set) 
				  {
					  for(int i=s.length()-1;i>=0;i--)
					  {
						  if(ch==s.charAt(i))
							{
								System.out.println(ch +" Is In "+(i+1)+" position ");
								break;
							}  
					  } 
				}
			}
	
// print position of each string character in reverse order using map----------------
	@Test
	public void positionStringInReverseUsingMap() {
		String str="I am from am from TestYantra";
		String s=str.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for(int i=0;i<s.length();i++) 
		{
			map.put(s.charAt(i), i);
		}
		
		for (Entry<Character, Object> m : map.entrySet()) 
		{
			for(int j=s.length()-1;j>=0;j--) 
			{
				if(m.getKey()==s.charAt(j)) 
				{
					System.out.println(m.getKey() +" Is In "+(j+1)+" position ");
					break;
				}
			}	
        }
	 
    }
}
