import java.io.*;
import java.util.*;

class ArraySameElements{
	
	public static void main(String[] args){
		
		Integer[] a={1,2,3,4,5};
		Integer[] b={1,3,5,4};
		Integer[] c={2,1,3,4,5};
		
		System.out.println(sameElements(a,b));
		System.out.println(sameElements(b,c));
		System.out.println(sameElements(a,c));
		
	}
	static boolean sameElements(Object[] a1,Object[] a2){
		Set<Object> e1=new HashSet<Object>(Arrays.asList(a1));
		Set<Object> e2=new HashSet<Object>(Arrays.asList(a2));
		if(e1.size()!=e2.size()){
			return false;
		}
		for(Object obj:e1){
			if(!e2.contains(obj)){
				return false;
			}
		}
		return true;
	}
	
	
}