package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {

	public static int kthSmallestElement(int [] arr,int k) {
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		}
		
		
		
		int count = 1;
		int ele = 0;
		for(int i =0;i<arr.length-1;i++) {
			
			if(k==1) {
				ele = arr[i];
				break;
			}
			if(arr[i]<arr[i+1]) {
				count++;
				if(count == k) {
					ele = arr[i+1];
					break;
				}
			}
		}
		
		return ele;
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
		
		System.out.println("Enter the kth position for smallest : ");
		int k = sc.nextInt();
		
		System.out.println("Output is :");
		
		int ele = kthSmallestElement(arr, k);
		System.out.println("the "+k+"th smallest element is : "+ele);
	}
}
