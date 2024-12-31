package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;
/*
 *  Q. Implement a java program to find kth smallest and largest
    element in an sorted array and print it.
 */
public class KthSmallestAndLargestElement {
	
	public static void KthSmallestAndLargest(int [] arr,int k) {
		Arrays.sort(arr);
		int Smallest =0;
		int Largest =0;
		int count1 =k;
		int count2 =k;
		
		
		
		for(int i = 0;i<arr.length-1;i++) {
			if(k==1) {
				Smallest = arr[i];
				break;
			}
			if(arr[i]<arr[i+1]) {
				Smallest = arr[i+1];
				count1--;
				if(count1 ==1) {
					break;
				}                  // 1 2 3 4 5
			}
		}
		
		for(int i = arr.length-1;i>0;i--) {
			
			if(k==1) {
				Largest = arr[i];
				break;
			}
			if(arr[i]>arr[i-1]) {
				Largest = arr[i-1];
				count2--;
				if(count2 ==1) {
					break;
				}
			}
		}
		
		System.out.println("smallest value is : "+Smallest);
		System.out.println("largest value is : "+Largest);
		
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
		
		System.out.println("Enter the kth position for smallest and largest : ");
		int k = sc.nextInt();
		
		System.out.println("Output is :");
		
		KthSmallestAndLargest(arr, k);
	}

}
