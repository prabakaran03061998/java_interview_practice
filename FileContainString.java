import java.io.*;
import java.util.*;

class FileContainString{

	public static void main(String[] args)  throws FileNotFoundException {
		File file = new File("D:\\stringfind.txt");
		System.out.println(file.exists());
		Scanner sc= new Scanner(file);	
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the string to check");
		String search=sc1.nextLine();
		boolean isContainText=false;
		while(sc.hasNextLine()){
			String line=sc.nextLine();
			if(line.contains(search)){
				isContainText=true;
			}
		}
		if(isContainText){
			System.out.println("File contain the string");	
		}else{
			System.out.println("File not containe the string");
		}
	}
}