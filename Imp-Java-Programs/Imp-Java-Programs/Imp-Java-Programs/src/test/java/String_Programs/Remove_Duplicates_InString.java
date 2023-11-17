package String_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Remove_Duplicates_InString {
	
	@Test
	public void removeStringwordsDuplicates() {
	ArrayList a1 =new ArrayList();
		a1.add("i");
		a1.add("am");
		a1.add("from");
		a1.add("am");
		a1.add("from");
		a1.add("testyantra");
		
		LinkedHashSet<String> s = new LinkedHashSet<String>(a1);
		System.out.println(s);
	}
//	@Test
//	public void StringWordDuplictesRemove() {
//		String s1="I am from am from testYantra";
//		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
//		for(int i=0;i<s1.length();i++) 
//		{
//			set.add(s1.charAt(i));
//		}
//		for (Character word : set) 
//		{
//			System.out.println(word.charValue());
//		}
//	}
	
	public class Remove_Duplicates_String {
		@Test
		public void removeStringDuplicates() {
			/*ArrayList a1 =new ArrayList();
			a1.add("t");
			a1.add("e");
			a1.add("s");
			a1.add("t");
			a1.add("y");
			a1.add("a");
			a1.add("n");
			a1.add("t");
			a1.add("r");
			a1.add("a");
			
		LinkedHashSet<String> s = new LinkedHashSet<String>(a1);
		System.out.println(s);*/
			
			String s="TestYantra";
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for(int i=0;i<s.length();i++) 
			{
				set.add(s.charAt(i));
			}
			for (Character character : set) 
			{
				System.out.println(character);
			}
		}
		@Test
		public void  RemoveDuplicateCharacInString() {
			String s="Rohan Rishabh Neha Venkatesh";
			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for(int i=0;i<s.length();i++) 
			{
				set.add(s.charAt(i));
			}
			int count =0;
			for (Character character : set) 
			{
				System.out.print(character);
				count++;
			}
			System.out.println(count);
		}
	}

}
