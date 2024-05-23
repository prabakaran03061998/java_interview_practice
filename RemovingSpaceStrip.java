import java.util.*;
import java.io.*;

class RemovingSpaceStrip {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();	
		input = input.strip();
		System.out.println("Removing space: "+ input);
		sc.close();
    }
}