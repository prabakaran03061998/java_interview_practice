import java.util.*;
import java.io.*;

class ArrayShuffel {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the numbers :");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}	
		Random random=new Random();
		for(int i=0;i<a.length;i++){
			int position=random.nextInt(a.length);
			int temp=a[position];
			a[position]=a[i];
			a[i]=temp;
			
		}
		System.out.println("After shuffel: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}	
		
    }
}