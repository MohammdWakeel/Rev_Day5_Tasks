import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		byte bytesArr[]=str.getBytes();
		byte arr[]=new byte[bytesArr.length];
		
		for(int i=0;i<bytesArr.length;i++) {
			arr[i]=bytesArr[bytesArr.length-i-1];
		}
		//String result=arr.toString();
		String result=new String(arr);
		System.out.println(result.toCharArray());

	}

}
