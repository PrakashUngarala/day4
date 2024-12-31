package logical_sections.day5;
/*
 * Q. Implement a java program to find the 2nd smallest element 
    in an array and print it.
 */
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestElement {

	public static int secondSmallest(int [] arr) {
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<arr[i+1]) {
				return arr[i+1];
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
		
		int ele = secondSmallest(arr);
		
		System.out.println(ele);
	}

}
