import java.util.*;
import java.io.*;

class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        char[] strChar=str.toCharArray();
         StringBuilder out=new StringBuilder();
        for(int i=strChar.length-1;i>=0;i--){
           out.append(strChar[i]);
        }
        System.out.println(out.toString());
		sc.close();
    }
}