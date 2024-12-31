package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Question 47: Delete All Occurrences of an Element
 Write a program to delete all occurrences of the element 
 2 from the array 
 {1, 2, 3, 2, 4, 2, 5}.
 Output: {1, 3, 4, 5}

 */
public class DeletingElementASpecificElement {

	public static void deletingSpecificElement(int [] arr,int ele) {
		
		
		int n=0;
		for(int i =0;i<arr.length-n;i++) {
			if(ele == arr[i]) {
				for(int j = i;j<arr.length-1-n;j++) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				i--;
				n++;
				
				
			}
		}
		
		int [] res = new int [arr.length-n];
		
		for(int i = 0;i<res.length;i++) {
			res[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(res));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter the "+size+" elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element you Want to delete : ");
		int k = sc.nextInt();
		
		System.out.println("Output is :");
		
		deletingSpecificElement(arr, k);
		
	}
	
}
