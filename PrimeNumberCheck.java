import java.util.*;
import java.io.*;

class PrimeNumberCheck {
	//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		if(isPrime(number)){
			System.out.println(number +" is prime number");
		}else{
			System.out.println(number +" is not prime number");
		}
		sc.close();		
    }
	
	static boolean isPrime(int n){
		if(n==0 && n==1){
			return false;
		}
		if(n==2){
			return true;
		}
		for(int i=2;i<=n/2;i++){
			System.out.println(i);
			if(n%i==0){
				return false;
			}
		}
		return true;		
	}
	
}