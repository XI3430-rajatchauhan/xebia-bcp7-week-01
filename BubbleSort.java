import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values of array");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int counter=1;
		while (counter<n) {
			for (int i=0;i<n-counter;i++) {
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			counter++;
		}
		for (int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}

	}

}
