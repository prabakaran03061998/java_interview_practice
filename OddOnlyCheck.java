import java.util.*;
import java.io.*;

class OddOnlyCheck {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		int[] list=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++){
			list[i]=sc.nextInt();
		}
		boolean isOddOnly=true;
		for(int i=0;i<list.length;i++){
			if(list[i]%2==0){
				isOddOnly= false;
			}
		}	
		if(isOddOnly){
			System.out.println("Array containe odd only");
		}else{
			System.out.println("Array not containe odd only");
		}
		sc.close();
    }
}