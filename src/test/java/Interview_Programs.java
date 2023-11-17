

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Interview_Programs {
	@Test
	public void SeparateArrayElements() {
		int a[]= {1,2,7,9,16,99,100};
		ArrayList<Integer> a1=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0)
			{
				 a1.add(a[i]);     
			}	
		}
		System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0)
			{
				
				a2.add(a[i]);
			}	
		}
		System.out.println(a2);
	}
@Test
public void Arrayvalidate() {
	int a[] = { 1,2,50,55,90,100 };
	
	for (int i = 0; i < a.length; i++)
	{
		int temp;
		for (int j = i + 1; j < a.length; j++)
		{
			if (a[i] > a[j]) 
			{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			} 
		}
	}
	System.out.println("Array elements are sorted");
 }
	
}
