import java.util.Scanner;
public class MakePalindrome {
	
	public static boolean palindrome(String s) {
		int n=s.length();
		int count=0;
		for(int i=0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) {
				count++;
			}
		}
		return count<=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		int count;
		if(palindrome(str)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		

	}

}
