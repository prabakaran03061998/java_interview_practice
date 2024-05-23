import java.util.*;
import java.io.*;

class RemovingWhiteSpace {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		StringBuilder out=new StringBuilder();
		char[] inputChar=input.toCharArray();
		for(char c:inputChar){
			if(c!='\s'){
				out.append(c);
			}
		}
		System.out.println(out.toString());
		sc.close();
    }
}