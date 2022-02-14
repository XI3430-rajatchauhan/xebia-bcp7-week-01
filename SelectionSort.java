import java.util.Scanner;
import java.util.*;
public class SelectionSort {
	public static void selectionsort(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			int index=i;
			for (int j=i+1;j<arr.length;j++) {
				if (arr[j]<arr[index]) {
					index=j;
				}
			}
			int small=arr[index];
			arr[index]=arr[i];
			arr[i]=small;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values of array");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		selectionsort(arr);
		for (int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}


	}

}
