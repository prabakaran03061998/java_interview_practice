import java.util.*;
import java.io.*;

class SwapWoutVari {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value a:");
		int a=sc.nextInt();
		System.out.println("Enter the value b:");
		int b=sc.nextInt();
		System.out.println("Befor Swapping \n a: "+a +"\n b: "+b);
		a=a+b; // 30=20+10
		b=a-b;//  20=30-10
		a=a-b;//  10=30-10
		System.out.println("After Swapping \n a: "+a +"\n b: "+b);
		sc.close();
    }
}