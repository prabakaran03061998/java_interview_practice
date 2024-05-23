import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.SimpleDateFormat;

class DateFormatter{
	
	public static void main(String[] args){
		String pattern="dd-MM-yyyy";
		SimpleDateFormat dateFormat=new SimpleDateFormat(pattern);
		String formatedDate=dateFormat.format(new Date());
		System.out.println("Formated Date is :"+formatedDate);
	}
}