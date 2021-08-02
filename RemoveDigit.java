
public class RemoveDigit {
	
	public static int left(int n) {
		while(n>=10) {
			n=n/10;
		}
		return n;
	}
	
	public static int right(int n) {
		n=n%10;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Array element:");
		int arr[]= {121,231,131,22,699};
		for(int i=0;i<arr.length;i++) {
			if(left(arr[i])==right(arr[i])) {
				continue;
			}
			System.out.println(arr[i]);
		}

	}

}
