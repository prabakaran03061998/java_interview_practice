import java.util.*;
import java.io.*;

class PyramidPattern {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int row=sc.nextInt();
		sc.close();
		System.out.println("Pattern1");
		printPattern1(row);
		System.out.println("Pattern2");
		printPattern2(row);
    }
	
	static void printPattern1(int row){
		for(int i=1;i<=row;i++){
			int numberOfWhiteSpace=row-i;
			printString("",numberOfWhiteSpace);
			printString(i+" ",i);
			System.out.println("");	
		}
	}
	
	static void printPattern2(int row){
		for(int i=1;i<=row;i++){
			int numberOfWhiteSpace=row-i;
			printString("",numberOfWhiteSpace);
			for(int x = 1; x<=i; x++) {
				System.out.print(x+" ");
			}
			System.out.println("");	
		}
	}
	
	static void printString(String s,int whiteSpace){
		for(int j=0;j<whiteSpace;j++){
			System.out.print(s);
		}
	}
	
}