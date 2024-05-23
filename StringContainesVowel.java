import java.util.*;
import java.io.*;

class StringContainesVowel {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value:");
		String actualString=sc.nextLine();
		if(actualString.toLowerCase().matches(".*[aeiou].*")){
			System.out.println("Vowels present");
		}else{
			System.out.println("Vowels not present");
		}
		sc.close();
    }
}