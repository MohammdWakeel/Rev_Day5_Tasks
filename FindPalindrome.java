
public class FindPalindrome {
	public static void remove(int arr[]) {
		String arr2=arr+"";
		String str[]=arr2.split(" ");
		
		//String strArr[]=str.split(" ");
		int len=str.length;
		int count=0;
		String temp[]=new String[len];
		for(int i=0;i<len/2;i++) {
			if(str[i] == str[len-i-1]) {
				temp[i]=str[i];
				count++;
			}
		}
		Integer i[]=Integer.valueOf(temp)
		for(int i=0;i<count;i++) {
			str[i]=temp[i];
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("new array");
		int arr[]= {121,131,20};
		remove(arr);

	}

}
