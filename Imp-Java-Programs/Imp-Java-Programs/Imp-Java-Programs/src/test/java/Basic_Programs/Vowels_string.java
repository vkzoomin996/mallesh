package Basic_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Vowels_string {
	@Test
	public void StringVowels() {
		String s="india";
		int count=0;
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				System.out.println("the vowel characters are:"+ ch); 
			}
		}	
		System.out.println("count of vowels are:"+count);
	
	}
	
	@Test
	public void arrayduplictaesremove(){
	int a[]={1,2,5,8,2,1,10};
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++){
	set.add(a[i]);
	}
	for (Integer list : set) {
		System.out.println(list);
	}	
  }
	@Test
	public void StringVowelsWithoutDuplicates() {
		String str="India";
		String s= str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++) 
		{
			set.add(str.charAt(i));
		}
		int count =0;
		for (Character ch : set) 
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
			count++;
			System.out.println("The vowels in the string are :"+ ch);
		}
	}
	    //System.out.println("count of vowels are:"+count);
	   
}
