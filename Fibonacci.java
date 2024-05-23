import java.util.*;
import java.io.*;

class Fibonacci {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int a=0,b=1,c=1;
		for(int i=1;i<=number;i++){
			System.out.print(a+", ");
			a=b;
			b=c;
			c=a+b;
		}
		sc.close();
		
    }
}