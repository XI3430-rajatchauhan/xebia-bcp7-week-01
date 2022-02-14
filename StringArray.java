
public class StringArray {

	public static void main(String[] args) {
		String[] strarr= {"Ram, Ranvir, Karan"};
		boolean x=false;
		int n=0;
		String s="Rajat";
		for (int i=0;i<strarr.length;i++) {
			if (s.equals(strarr[i])) {
				n=i;
				x=true;
				break;
			}
		}
		if (x) {
			System.out.println(s+" String is found at index "+n);
		}
		else {
			System.out.println(s+" String is not found in the array");
		}

	}

}
