package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Question 48:
Split Array into N Equal Parts
 Write a program to split an array {1, 2, 3, 4, 5, 6, 7, 8, 9} 
 into 3 equal parts.

 Output:
 Part 1: {1, 2, 3}
 Part 2: {4, 5, 6}
 Part 3: {7, 8, 9}

 */
public class SplittingArrayIntoNequalParts {

	public static void splittingArrayintoNequalParts(int [] arr) {
		int Elements=0;

		for(int i = 3;i<arr.length;i++) {
			if(arr.length%i==0) {
				Elements = i;
				break;
			}
		}
		
		
		int parts = arr.length/Elements;

		int index =0;
		for(int i = 0;i<parts;i++) {
			int [] res = new int [Elements];
			
			for(int j =0;j<Elements;j++) {
				
				res[j] = arr[index++];
				
			}
			System.out.println(Arrays.toString(res));
		}
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


		splittingArrayintoNequalParts(arr);

		

	}
}
