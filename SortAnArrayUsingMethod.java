import java.io.*;
import java.util.*;

class SortAnArrayUsingMethod{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();	
		int[] a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		sc.close();
		
	}
	
}