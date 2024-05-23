import java.util.*;
import java.io.*;

class OddOnlyCheckList {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>(size);
		System.out.println("Enter the numbers:");
		
		for(int i=0;i<size;i++){
			list.add(sc.nextInt());
		}
		//if(list.parallelStream().anyMatch(x->x%2!=0)){
		//	System.out.println("only odd number");
		//}else{
		//	System.out.println("Not only odd number");
		//}
		boolean isOddOnly=true;
		for(Integer i:list){
			if(i%2==0){
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