 package Array_programs;

import java.util.TreeSet;

import org.testng.annotations.Test;

public class Array_Programs_Without_BB_Technique {
	//Methods without using buble sort technique
		@Test
		public void getFirstMinArrayEle() {
			int a[]= {7,-3,0,2,1,-9};
			System.out.println("Array elements are:");
			for(int i=0;i<a.length;i++) 
			{
				System.out.println(a[i]);
			}
			int smallest =a[0];
			System.out.println("1st Smallest Arrayelements is:");
			for(int i=0;i<a.length;i++) 
			{  
				if(smallest>a[i]) 
				{
					smallest =a[i];
				}
			}
			System.out.println(smallest);
		}
		
		@Test
		public void getFirstMaxArrayEle() {
			int a[]= {10,200,30,520,24};
			System.out.println("Array elements are:");
			for(int i=0;i<a.length;i++) 
			{
				System.out.println(a[i]);
			}
			int largest=a[0];
			System.out.println("1st largest Arrayelements is:");
			for(int i=0;i<a.length;i++) 
			{
				if(largest<a[i]) 
				{
					largest =a[i];
				}
			}
			System.out.println(largest);	
		}
//fetching 2nd min and 2nd max array elements without using bubble sort technique by using collections------------------
		@Test
		public void fetchSecondMinAndMaxArrayElements() {
			int a[]= {8,4,3,9,2,7,5,6};
			TreeSet<Integer> set = new TreeSet<Integer>();
			for(int i=0;i<a.length;i++)
			{
				set.add(a[i]);	
			}
			System.out.println(set);
			set.pollFirst();
			set.pollLast();
			System.out.println(set.pollFirst());
	     	System.out.println(set.pollLast());
		}						
//getting 1st and 2nd smallest element in an array---------------------------------------------
		@Test
		public void secondMinElementArray() {
		int a[]= {20,25,4,6,12};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) 
		{
		     if(a[i]<=fmin) 
		     {
		    	 if(a[i]!=fmin);
		    	 {
		    		 smin =fmin;
		 
		    	 }
		    	 fmin =a[i];
		     }
		     else if(smin==fmin || smin>a[i])
		     {
		    	 smin=a[i];
		     }
		}
		System.out.println(fmin);
		System.out.println(smin);
 }
//getting 1st and 2nd largest element in an array--------------------------------------
		@Test
		public void getFirstSecondMinArrayEle() {
		int a[]= {20,25,4,6,12};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) 
		{
		     if(a[i]>fmax) 
		     {
		    	 if(a[i]!=fmax);
		    	 {
		    		 smax =fmax;
		 
		    	 }
		    	 fmax =a[i];
		     }
		     else if(smax==fmax || smax<a[i])
		     {
		    	 smax=a[i];
		     }
		}
		System.out.println(fmax);
		System.out.println(smax);	
	}			
//Array Addition pairs count ---------------------------------------
		@Test
		public void ArrayAdditionComboPair() {
			int a[]= {8,4,3,9,2,7,5,6};
			int count =0;
			for(int i=0;i<a.length;i++) 
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j]==11) 
					{
						System.out.println(a[i]+"---"+a[j]);
						count++;
					}	
				}
			}
			System.out.println("Total no of Addition combo pairs are :"+ count);
		}
		
//Addition of two arrays-----------------------------
		@Test
		public void addOfTwoArrays()
		{ 
			int a[]= {2,3,5,9,8};
			int b[]= {4,6,5,18};
			int length = a.length;
			if(a.length<b.length) 
			{
				length=b.length;
			}
			  for(int i=0;i<length;i++) 
			  {
				try 
				{
					System.out.println(a[i]+b[i]);
				} 
				catch (Exception e)
				{
					if(a.length<b.length) 
					{
						System.out.println(b[i]);
					}
					else
					{
						System.out.println(a[i]);
					}
				}
			  }	
		 }
 }
		
