import java.util.*;
import java.io.*;

class Palindrome {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		if(checkPalindrome(input)){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}	
		sc.close();
    }
	
	static boolean checkPalindrome(String input){
		boolean isPalindrome=true;
		int length=input.length();	
		for(int i=0;i<length/2;i++){
			System.out.println(input.charAt(i)+"!="+input.charAt(length - i -1));
			if(input.charAt(i)!=input.charAt(length - i -1)){
				isPalindrome=false;
				break;
			}
		}
		return isPalindrome;
	}
	
}