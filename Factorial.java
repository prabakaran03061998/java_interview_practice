import java.util.*;
import java.io.*;

class Factorial {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the factorial number:");
		int input=sc.nextInt();
		int fact=1;
		for(int i=1;i<=input;i++){
			fact=fact*i;
		}
		System.out.println("Factorial number is: "+fact);
		System.out.println("Factorial number using recursion: "+recursionFact(input));
		sc.close();
    }
	
	 static int recursionFact(int n){
		 if(n==0)
			 return 1;
		 else
			 return n*recursionFact(n-1);
	 }
}