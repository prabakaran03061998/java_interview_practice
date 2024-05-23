import java.util.*;
import java.io.*;

class FindingLargestNumber {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the numbers :");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("The largest number is: "+largest(a));
		sc.close();
    }
	
	static int largest(int[] a){
		int max=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		return max;
	}
	
}