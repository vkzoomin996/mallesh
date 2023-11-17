package String_Programs;

import org.testng.annotations.Test;

public class Reverse_String_Programs {
	
	/**
	 * This method is used to reverse string without using one more variable
	 */
	@Test
	public void reverseStringwithoutusingOthervariable()
	{
		String S ="Banglore";
		for(int i=S.length()-1;i>=0;i--) 
		{
			System.out.print(S.charAt(i));
		}
	}
	
	@Test
	public void reverseStringUsingStringBuffer() 
		{
		StringBuffer s = new StringBuffer("Banglore");
		System.out.println(s.reverse());
	    }

	@Test
	public void reverseStringUsingStringBuilder() 
		{
		StringBuilder s = new StringBuilder("Banglore");
		System.out.println(s.reverse());
	    }
	
	/**
	 * This method is used to reverse string using one more variable
	 */	
	@Test
	public void reverseString() {
	String s="Banglore";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) 
	{
		rev=rev+s.charAt(i);
	}
    System.out.println(rev);
  }
	
/**
 * Reverse Words in a string
 */
@Test
public void reverseStringWords() {
	String str="Welcome to explo";
	String[] s =str.split(" ");
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.println(s[i]);
	}
  }

@Test
public void reverseStringWords1() {
	String str="Today is friday";
	String[] s =str.split(" ");
	for(int i=s.length-1;i>=0;i--)
	{
		System.out.println(s[i]);
	}
  }
@Test
public void PrintStringWords() {
	String str="My name is radha";
	String[] s =str.split(" ");
	for(int i=0;i<s.length;i++)
	{
		System.out.print(s[i]);
	}
  }


@Test
public void reverseWordsInString() {
	String str="I am Selenium";
	String[] s =str.split(" ");
	for(int i=0;i<s.length;i++)
	{
		String st=s[i];
		for(int j=st.length()-1;j>=0;j--) 
		{
			System.out.println(st.charAt(j));
		}
		System.out.println(" ");
	}
  }
@Test
public void ReverseWordsandCharactersInStringArray() {
	String s[]= {"my","name","is","ok"};
	for(int i=s.length-1;i>=0;i--) 
	{
		String s1=s[i]+" ";
		for(int j=s1.length()-1;j>=0;j--) 
		{
			System.out.print(s1.charAt(j));
		}
			
	}
 }
@Test
public void reverseStringCharaInWord() {
String s[]={"I" ,"am","in", "OOty"};

for(int i=1;i<s.length;i++) 
{
	String s1=s[i]+" ";
	for(int j=s1.length()-1;j>=0;j--) 
	{
		System.out.print(s1.charAt(j));
	}
 }
 }
@Test
public void reverseStringCharaInWord1() {
String s[]={"I" ,"love","Programing"};

for(int i=0;i<s.length;i++) 
{
	String s1=s[i]+" ";
	for(int j=s1.length()-1;j>=0;j--) 
	{
		System.out.print(s1.charAt(j));
	}
 }
 }
@Test
public void reverseStringCharaInWord2() {
String s[]={"my" ,"name","is","anusha"};

for(int i=0;i<s.length;i++) 
{
	String s1=s[i]+" ";
	for(int j=s1.length()-1;j>=0;j--) 
	{
		System.out.print(s1.charAt(j));
	}
 }
 }
}

