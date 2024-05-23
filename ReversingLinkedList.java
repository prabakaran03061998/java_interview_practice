import java.util.*;
import java.io.*;

class ReversingLinkedList {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		LinkedList<Integer> l1=new LinkedList<>();
		System.out.println("Enter the numbers :");
		for(int i=0;i<=size-1;i++){
			l1.add(sc.nextInt());
		}
		LinkedList<Integer> l2=new LinkedList<>();
		l1.descendingIterator().forEachRemaining(l2::add);
		System.out.println(l2);
    }
	
}