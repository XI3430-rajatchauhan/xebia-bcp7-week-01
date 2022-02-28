public class LongestContinuousAscendingSequence {

	public static void main(String[] args) {
		int arr[]= {1,2,2,2,1,3,5};
		int arr1[]=new int[arr.length];
		arr1[0]=1;
		int mx=1;
		for (int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int prev=arr[i-1];
			if (prev<curr) {
				arr1[i]=arr1[i-1]+1;
			}
			else {
				arr1[i]=1;
			}
			if (arr1[i]>mx) {
				mx=arr1[i];
			}
		}
		System.out.println(mx);

	}

}
