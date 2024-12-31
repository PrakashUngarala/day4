package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q. Implement a java program to find the 2nd largest
    element in an array and print it. 
 */
public class SecondLargestElement {

	public static int secondLargest(int []arr) {
		
		Arrays.sort(arr);
		
		for(int i =arr.length-1;i>=0;i--) {
			if(arr[i]>arr[i-1]) {
				return arr[i-1];
			}
		}
		
		return -1;
		
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
		
		
		System.out.println("Output is :");
		
		int ele = secondLargest(arr);
		
		System.out.println(ele);
	}

}
