
import java.util.*;

import java.lang.*;

import java.io.*;

import java.lang.Math;



public class FridayChallenge {

    

    public static boolean polindrome(String s){

        int len=s.length();

        for(int i=0;i<len;i++) {
            if(s.charAt(i)!=s.charAt(len-i-1)) {
             return false;
            }
        }
        return true;
    }

    public static String lovePalindromes(String str) {
        
        if(str.length()==1)
          return str;
        else{
        	String result="Z";
        int n=str.length();
        if(polindrome(str))
          return result;
        else{

            String s=Character.toString(str.charAt(str.length()-1));

            str+=s;

            if(polindrome(str)){

                return s;

            }

            else{

                return result;

            }

        }
    }
    }
   
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	System.out.println(lovePalindromes(str));
    }
    }