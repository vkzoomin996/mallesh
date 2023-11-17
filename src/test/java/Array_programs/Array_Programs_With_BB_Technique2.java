package Array_programs;

import org.testng.annotations.Test;

public class Array_Programs_With_BB_Technique2 {

	@Test
	public void sortArrayInAscending() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	@Test
	public void sortArrayInDescending() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			int temp;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	// Using Buble sort technique
	@Test
	public void getFirstMinArrayele() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("1st smallest element in an array is:" + a[0]);
	}

	@Test
	public void getfirstMaxArrayEle() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("1st largest element in an array is:" + a[0]);
	}

	@Test
	public void getSecondMinArrayele() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("2nd smallest element in an array is:" + a[1]);
	}
	
	@Test
	public void getSecondMaxArrayEle() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("2nd largest element in an array is:" + a[1]);
	}

	@Test
	public void getsecondMinArrayEle() {
		int a[] = { 120, 200, 30, 5, 14 };
		System.out.println("Array elements are:");// Second smallest element in an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int temp = 0;
		System.out.println("2nd smallest Arrayelements is:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}

	@Test
	public void getsecondMaxArrayEle() {
		int a[] = { 12, 20, 30, 5, 14 };
		System.out.println("Array elements are:");// Second largest element in an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int temp = 0;
		System.out.println("2nd largest Arrayelements is:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(a[a.length - 2]);
	}

	

	@Test
	public void addFirstThreeMinArrayEle() {
		int a[] = {7,-6,11,9,0,4 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("The sum of first three min elements  of array are:");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

	@Test
	public void addFirstThreeMaxArrayEle() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] < a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("The sum of first three max elements  of array are:");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

	@Test
	public void prodFirstThreeMinArrayEle() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] > a[j]) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("The product of first three min elements  of array are:");
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul = mul * a[i];
		}
		System.out.println(mul);
	}

	@Test
	public void prodFirstThreeMaxArrayEle() {
		int a[] = { 10, 2, 3, 1, 51 };
		System.out.println("Array elements before sorting are:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array elements after sorting are:");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println("The product of first three max elements  of array are:");
		int mul = 1;
		for (int i = 0; i < 3; i++) {
			mul = mul * a[i];
		}
		System.out.println(mul);
	}
}
