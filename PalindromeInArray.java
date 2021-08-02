
public class PalindromeInArray {

	
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
		if(n>0) {
			int d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		}
		return rev;
	}
	
	/*public static int isPalindromic(int n) {
		int res;
		if(n==reverse(n)) {
			res=System.out.println(n);
		}
		return res;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,786,353,121,56,434};
		System.out.println("Array");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==reverse(arr[i]))
			System.out.println(arr[i]);
		}

	}

}
