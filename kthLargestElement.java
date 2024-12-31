package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;

public class kthLargestElement {

	public static int kthLargestElemet(int [] arr,int k) {
		Arrays.sort(arr);
		int count =1;
		int ele =0;
		for(int i =arr.length-1;i>0;i--) {
			
			if(k==1) {
				ele = arr[i];
				break;
			}
			if(arr[i]>arr[i-1]) {
				count++;
				if(count == k) {
					ele = arr[i-1];
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
		
		System.out.println("Enter the kth position for largest : ");
		int k = sc.nextInt();
		
		System.out.println("Output is :");
		
		int ele = kthLargestElemet(arr, k);
		System.out.println("the "+k+"th largest element is : "+ele);
	}
}
