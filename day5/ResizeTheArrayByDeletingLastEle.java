package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Question 49: Resize Array by Decreasing the Size
 Write a program to resize an array {1, 2, 3, 4, 5} to a 
 smaller size and remove the last element.
 Output:
 Resized array: {1, 2, 3, 4}

 */
public class ResizeTheArrayByDeletingLastEle {

	
	public static void ResizeTheArray(int [] arr) {
		int [] res = new int [arr.length-1];
		for(int i =0;i<arr.length-1;i++) {
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
		
		System.out.println("Output is :");


		ResizeTheArray(arr);

		

	}

}
