import java.util.*;
import java.io.*;

class FindSecondHighest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the numbers :");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("The second highest number is: "+findHighest(a));
		sc.close();
    }
	
	static int findHighest(int[] a){
		int highest=0;
		int secondHighest=0;
		for(int i: a){
			if(i>highest){
				secondHighest=highest;
				highest=i;
			}else if(i>secondHighest){
				System.out.println("s2:====="+secondHighest+"   == "+highest+"   ==="+i);
				secondHighest=i;
			}
		}
		return secondHighest;
	}
}