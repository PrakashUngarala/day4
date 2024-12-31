package logical_sections.day5;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Question 46: Delete an Element at a Specific Index
  Write a program to delete the element at the 2nd index of the 
  array {1, 2, 3, 4, 5}.
  Output: {1, 2, 4, 5}
 */
public class DeleteAElementAtSpecificIndex {

	public static int [] deleteAtSpecificIndex(int [] arr,int k) {
		
		if(k<0 || k>=arr.length) {
			return arr;
		}
		
		int [] res = new int[arr.length-1];
		int index =0;
		for (int i = 0; i < arr.length; i++) {
            if (i != k) {
                res[index++] = arr[i];
            }
        }

		
		
		return res;
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
		System.out.println("enter the index you want to delete : ");
		int index = sc.nextInt();
		
		System.out.println("Output is :");
		
		int [] res = deleteAtSpecificIndex(arr,index);
		
		System.out.println(Arrays.toString(res));
		
	}

}
