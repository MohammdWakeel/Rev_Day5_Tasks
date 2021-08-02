import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
	    
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//isPrime(a);
		for(int i=0;i<n;i++) {
			if(isPrime(a[i]))
			System.out.println(a[i]);
		}
		

	}

}
