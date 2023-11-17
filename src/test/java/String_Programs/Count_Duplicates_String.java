package String_Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Count_Duplicates_String {
	@Test
	public void countDuplicateCharacUsingCollection() {
		String str="TestYantra";
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) 
		{
			set.add(s.charAt(i));
		}
			for (Character ch : set) 
			{
				int count =0;
				for(int i=0;i<s.length();i++) 
				{
					if(ch==s.charAt(i)) 
					{
						count++;
					}
				}
				if(count>1) 
				{
					System.out.println(" Character: "+ ch +" is repeating : "+count +" times ");
				
				}	
			}
		}	
	
	@Test
	public void countDuplicateCharacUsingMap() {
        String str="I am from am from TestYantara";
        String s=str.toLowerCase();
        LinkedHashMap<Character, Object> map =new LinkedHashMap<Character, Object>();
		for(int i=0;i<s.length();i++) 
		{
			map.put(s.charAt(i),i);
		}
		for (Entry<Character, Object> m : map.entrySet()) 
		{
			int count =0;
			for(int i=0;i<s.length();i++) 
			{
				if(m.getKey()==s.charAt(i)) 
				{
					count++;
				}
			}
			if(count>1) 
			{
				System.out.println(" Character: "+ m.getKey() +" is repeating : "+count +" times ");
			
			}	
		}
		}
	@Test
	public void stringCharCountwithoutDuplicatesUsingMap() {
		String str="Rohan Rishabh Neha Venkatesh";
		String s=str.toLowerCase();
		LinkedHashMap<Character, Object> map = new LinkedHashMap<Character, Object>();
		for(int i=0;i<s.length();i++) 
		{
		   map.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m : map.entrySet()) 
		{
			int count =0;
			for(int i=0;i<s.length();i++) 
			{
				if(m.getKey()==s.charAt(i)) 
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(" Character: "+ m.getKey() +" is repeating : "+count +" times ");	
			}
		}
	}
			
				
	}


