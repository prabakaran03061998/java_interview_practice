import java.util.*;
import java.io.*;

class SortAnArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();	
		int[] a=new int[size];
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		for(int i=0;i<a.length;i++){
			for(int j=1+1;j<a.length;j++){
				int temp=0;
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			for(int m=0;m<a.length;m++){
				System.out.print(a[m]+", ");
			}
		}
		System.out.println("");
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		System.out.println("");
		for(int i=0;i<a.length;i++){
			for(int j=1+1;j<a.length;j++){
				int temp=0;
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			for(int m=0;m<a.length;m++){
				System.out.print(a[m]+", ");
			}
		}
		System.out.println("");
		System.out.println("After decending");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+", ");
		}
		sc.close();
    }
}