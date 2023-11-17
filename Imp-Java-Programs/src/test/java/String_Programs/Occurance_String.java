package String_Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Occurance_String {
	@Test
	public void stringCharCountUsingCollection() {
		String str="aaabbcdddf";
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
			System.out.println(ch+ " is repeating "+ count +" times");
		}
	}
	@Test
	public void stringCharCountUsingCollection1() {
		String str="aweexxxyyyyyy";
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
			System.out.println(ch + " is repeating "+ count +" times");
		}
	}
		
	
	@Test
	public void stringCharCountUsingMap() {
		String str="The Glass is green";
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
				System.out.println(" Character: "+ m.getKey() +" is repeating : "+count +" times ");	
		}
	}
	
	
	@Test
	public void StringWordCountUsingCollection() {
		String str="The Glass is Green";
		String s=str.toLowerCase();
		String[] st=str.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<st.length;i++) {
			set.add(st[i]);
		}
		for (String word : set) 
		{
			int count =0;
			for(int i=0;i<st.length;i++) 
			{
				if(word.equals(st[i])) 
				{
					count++;
				}
			}
			System.out.println(word +" :Is repeating "+ count +" :times");
		}
		
	}
	
	@Test
	public void StringWordCharacPOsitionsUsingCollectionMap() {
		String str="my name is rishav";
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
			
}
