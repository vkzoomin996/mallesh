package String_Programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Find_Vowels_In_String {
	@Test
	public void vowelCountStringWithDuplicates() {
		String s="Education";
		int count =0;
		for(int i=0;i<s.length();i++) 
		{
			char ch=s.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			  count++;
			  System.out.println(" the vowel characters are :"+ ch);
			}
		}
          System.out.println(" no of vowels in a String are : " + count);
	}
	
	@Test
	public void vowelCountStringWithDuplicatesWithScannerClass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.nextLine();
		char[] ch =s.toCharArray();
		int count=0;
		for(int i=1;i<s.length();i++) 
		{
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
			  count++;
			  System.out.println(" the vowel characters are :"+ ch[i]);
			}
		}
	      System.out.println(" no of vowels in a String are : " + count);   	
	}
//vowelCount String WithOut Duplicates Using Collection 	
	@Test
	public void vowelCountStringWithOutDuplicatesUsingCollection() {
    String str="veeresha";	
    String s=str.toLowerCase();
    LinkedHashSet<Character> set = new LinkedHashSet<Character>();
    for(int i=1;i<s.length();i++) 
	{
    	set.add(str.charAt(i));
	}
    int count =0;
    for (Character ch : set)
    {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
			System.out.println(" the vowel characters are :"+ ch);
		}
	}
    System.out.println(" no of vowels in a String are : " + count);   	
}
// scanner class----------------------------------------------------------------	
	@Test
	public void vowelCountStringWithOutDuplicatesUsingScannerClass() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		String s=str.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=1;i<s.length();i++) 
		{
	    	set.add(str.charAt(i));
		}
		int count=0;
		for (Character ch : set) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
			  count = count+1;
			  System.out.println(" the vowel characters are :"+ ch);
			}
		}
		 System.out.println(" no of vowels in a String are : " + count);	
	}
}
