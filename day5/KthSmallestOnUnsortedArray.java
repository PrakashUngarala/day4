package logical_sections.day5;
/*
 *  Q. Implement a java program to find kth smallest element in an
    unsorted array and print it. 

 */
import java.util.Scanner;

public class KthSmallestOnUnsortedArray {

	public static int kthSmallestElement(int [] arr,int k) {
		
		int max=0;
		int min = 0;
		for(int val : arr) {
			if(max<val) {
				max = val;
			}
			if(min>val) {
				min = val;
			}
		}
		int count =0;
		for(int i = min; i<=max;i++) {
			
			for(int j =0;j<arr.length;j++) {
				if(i == arr[j]) {
					count++;
					break;
				}
			}
			if(count==k) {
				return i;
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
		
		System.out.println("Enter the kth position for smallest : ");
		int k = sc.nextInt();
		
		System.out.println("Output is :");
		
		int ele = kthSmallestElement(arr, k);
		System.out.println("the "+k+"th smallest element is : "+ele);
	}

}
