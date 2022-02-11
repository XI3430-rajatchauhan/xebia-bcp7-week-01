import java.util.*;
public class Reverseanarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter values of array");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp;
		int start=0;
		int end=n-1;
		while (start < end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("Reverse array is ");
		for (int j=0;j<n;j++) {
			System.out.println(arr[j]);
		}

	}

}
