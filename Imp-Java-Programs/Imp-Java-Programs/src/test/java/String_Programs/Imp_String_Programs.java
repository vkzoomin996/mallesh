package String_Programs;

import org.testng.annotations.Test;

public class Imp_String_Programs {
//Segregate Alphabets,numbers,Special characters in a String--------------------	
	@Test
	public void stringSegregate() {
		String str = "Abc@2926";
		String alpha = " ";
		String num = " ";
		String spcl = " ";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alpha = alpha + ch;
			} else if (ch >= '0' && ch <= '9') {
				num = num + ch;
			} else {
				spcl = spcl + ch;
			}
		}
		System.out.println(" The characters in the string are :" + alpha + num + spcl);
	}

// Adding numbers in the String
	@Test
	public void addNumString() {
		String str = "Charan2926";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				int num = str.charAt(i) - 48;
				sum = sum + num;
			}
		}
		System.out.println(" The sum of numbers in the string is : " + sum);
	}

// Sum of two digits in string
	@Test
	public void sumOfTwoDigitsString() {
		String str = "12a11b3";
		int sum = 0;// 0 12 23
		int tsum = 0;// 0 1 12 0 1 11 0 3
		for (int i = 0; i < str.length(); i++)
		// i=0; 0<7(t)
		// 1=1; 1<7(t)
		// i=2; 2<7(t)
		// i=3; 3<7(t)
		// i=4; 4<7(t)
		// i=5; 5<7(t)
		// i=6; 6<7(t)
		// i=7; 7<7(f)
		{
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') // 1t,2t,af,1t,1t,bf,3t
			{
				int num = str.charAt(i) - 48;// num=49-48=1,50-48=2,49-48=1,49-48=1,51-48=3
				tsum = tsum * 10 + num;// tsum=0*10+1=1,1*10+2=12,0*10+1=1,1*10+1=11,0*10+3=3
			} else {
				sum = sum + tsum;// 0+12=12,12+11=23
				tsum = 0;
			}
		}
		sum = sum + tsum;// 23+3=26
		System.out.println(" The sum of numbers in the string is : " + sum);
	}

	@Test
	public void printMinLengthValuesStringArray() {
		String[] s = { "12", "1234", "12345", "45", "123456" };
		String minlen = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() < minlen.length()) {
				minlen = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == minlen.length()) {
				System.out.println(s[i]);
			}
		}
	}

	@Test
	public void printMaxLengthValuesStringArray() {
		String[] s = { "12", "1234", "12345", "45", "123456", "222454" };
		String maxlen = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > maxlen.length()) {
				maxlen = s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == maxlen.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	
}
