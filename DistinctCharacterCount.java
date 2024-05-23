import java.io.*;
import java.util.*;

class DistinctCharacterCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input=sc.nextLine();
		char[]  chars=input.toCharArray();
		Map<Character,Integer> info=new HashMap<Character,Integer>();
		for(char c:chars){
			if(info.containsKey(c)){
				info.put(c,info.get(c)+1);
			}else{
				info.put(c,1);
			}
		}	
		System.out.println(info);	
	}
}