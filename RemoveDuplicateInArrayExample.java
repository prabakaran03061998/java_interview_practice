import java.io.*;
import java.util.*;

class RemoveDuplicateInArrayExample{

	public static void main(String[] args){
		int[] arr={1,1,2,2,2,55,77,88,77,88,33,33};
		int length=removeDubicates(arr,arr.length);
		for (int i=0; i<length-1; i++)  
          System.out.print(arr[i]+" ");  
	}
	
	static int removeDubicates(int[] arr, int length){
		int[] temp=new int[length];
		if(length==0 && length==1){
			return length;
		}
		
		int j=0;
		for (int i=0;i < length-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[length-1];  
		return j;
	}
}