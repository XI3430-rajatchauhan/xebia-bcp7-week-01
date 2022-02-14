import java.util.*;

public class QuickSort {
	int partition (int[] arr, int s, int e) {
		int pivot=arr[e];
		int i=(s-1);
		for (int j=s;j<=e;j++) {
			if (arr[j]<pivot) {
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		int t=arr[i+1];
		arr[i+1]=arr[e];
		arr[e]=t;
		return (i+1);
	}
	void quick(int[] arr, int s, int e) {
		if (s<e) {
			int p=partition(arr,s,e);
			quick(arr,s,p-1);
			quick(arr,p+1,e);
		}
	}
	void printArr(int[] arr, int n) {
		int i;
		for (i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
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
		QuickSort q1=new QuickSort();
		q1.quick(arr, 0, n-1);
		q1.printArr(arr, n);
		System.out.println();

	}

}
