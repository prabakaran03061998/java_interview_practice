import java.util.*;
import java.io.*;

class PrintFibonacciRecursive {
	//F(N)=F(N-1)+F(N-2)
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		System.out.println("Fibonaci series of "+number+" numbers:");
		for(int i=0;i<number;i++){
			System.out.print(fibonacci(i)+" ");
		}
		sc.close();
    }
	
	static int fibonacci(int count){
		if(count<=1){
			return count;
		}
		return fibonacci(count - 1) + fibonacci(count - 2);
	}
	
	
}