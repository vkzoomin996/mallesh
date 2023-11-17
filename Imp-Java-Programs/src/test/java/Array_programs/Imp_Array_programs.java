package Array_programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Imp_Array_programs {
	//Appending ArrayElements to last----------------------------
	@Test
	public void appendArrayelements() {
		int a[]= {2,5,0,8,0};
		int b[]=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=0)
			{
				b[m]=a[i]; 
				m++;
			}
			else 
			{
			    b[n]=a[i];	
			    n--;
			}
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}
	}			
			
	//Appending ArrayElements to first--------------------------------
	@Test
	public void appendArrayele() {
		int a[]= {2,5,0,8,0};
		int b[]=new int[a.length];
		int m=0;
		int n=a.length-1;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==0)
			{
				b[m]=a[i]; 
				m++;
			}
			else 
			{
			    b[n]=a[i];	
			    n--;
			}
		}
		for(int i=0;i<b.length;i++) 
		{
			System.out.println(b[i]);
		}		
	}	
		
	//Remove Duplicates in an array by using collection----------------------------------
	@Test
	public void removeDuplicatesInAnArrayUsingCollection() 
	{
	 int a[]= {1,2,4,1,5,6,8};	
	 HashSet<Integer> set = new HashSet<Integer>();// we can use linked_hashset also instead of hashset
	 for(int i=0;i<a.length;i++)
	 {
	   set.add(a[i]); 
	 }
	 for (Integer result : set) 
	 {
		 System.out.println(result);
	 }
	 System.out.println(set);
	   
	}
	
	//Remove Duplicates by using map------------------------------------------------------
	@Test
	public void removeDuplicatesInAnArrayUsingMap() {
		int a[]= {2,5,6,8,9,2,5};
		HashMap<Object,Object> map = new HashMap<Object,Object>();
		for(int i=0;i<a.length;i++)
		{
		  map.put(a[i], i);
		}
		for (Entry<Object,Object> m:map.entrySet()) {
			System.out.println(m.getKey());
		}
	}
	
	//Count the all  no of elements  in An Array using collection------------------------------
	@Test
	public void countTheEleInArray() 
	{
		int a[]= {1,2,4,1,4,6,8};
		HashSet<Integer> set = new HashSet<Integer>();
		 for(int i=0;i<a.length;i++)
		 {
		   set.add(a[i]); 
		 } 	
		 System.out.println(set);
		 for (Integer list : set) 
		 {
			int count =0;
			 for(int i=0;i<a.length;i++) 
			 {
				 if(list==a[i]) 
				 {
					 count++;
				 }
			 }
			 System.out.println(list+"---"+count ); 
		 } 
     }
	
	//Count the all no of Elements in an array using map-------------------
	@Test
	public void CountTheEleInArray() {
		int a[]= {2,5,6,8,9,2,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
		  map.put(a[i], a[i]);
		}
		 for(Integer nn:map.values()) 
		 {
				int count =0;
				for(int i=0;i<a.length;i++)
				{
				 if(nn ==a[i]) 
				 {
					 count++;
				 }
			 }
			 System.out.println(nn+"---"+count ); 
		}
	}
	
	//Count only the no of duplicates in an array using collection------------------------------
	@Test
	public void countOnlyDuplictesArray() {
	int a[]= {1,2,1,2,5,6,8,5,8};
	HashSet<Integer> set = new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
	System.out.println(set);
	for (Integer list : set) 
	 {
		int count =0;
		 for(int i=0;i<a.length;i++) 
		 {
			 if(list==a[i]) 
			 {
				 count++;
			 }
		 }
		 if(count>1)
		 {
			 System.out.println(list+" is repeating " + count+"times");
		 }
	 } 
  }
	
// count only duplictes in a array using map------------------------------------
	@Test
	public void CountonlyduplicateEleInArray() {
		int a[]= {2,5,6,8,9,2,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
		  map.put(a[i], a[i]);
		}
		 for(Integer nn:map.values()) 
		 {
			 System.out.println(nn);
				int count =0;
				for(int i=0;i<a.length;i++)
				{
				 if(nn ==a[i]) 
				 {
					 count++;
				 }
		        }
		 if(count>1) 
		 {
			System.out.println(nn+ " is repeating "+count+" times"); 
		 }	
	    }
	}
	
  //fetching the positions of an array elements without duplicates Using collection------------------------
	@Test
	public void fetchIndexesArrayWithoutDupli() {
		int a[]= {1,2,1,2,5,6,8,5,8};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		for (Integer list : set) {
			for(int i=0;i<a.length;i++)
			{
			  if(list==a[i])
			  {
				  System.out.println(list+" is present in: "+ (i+1) +" position ");
				  break;
			  }
			}
		}
	}
		
	//fetching the positions of an array elements without duplicates using  map -------------------------------
	@Test
	public void fetchThePositionsofArrayEleWithDupli() {
		int a[]= {2,5,6,8,9,2,5};
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
		  map.put(a[i], a[i]);
		}
		 for(Integer nn:map.values()) 
		 {
				for(int i=0;i<a.length;i++)
				{
				 if(nn ==a[i]) 
				 {
					 System.out.println(nn+" is present in "+(i+1)+" position"); 
				 }
			 } 
		}
	}
}