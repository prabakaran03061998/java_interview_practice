import java.util.*;
import java.io.*;
import java.lang.*;

class Synchronize implements Runnable{
	
	private Object obj1;
	private Object obj2;
	
	Synchronize(Object obj1,Object obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	

	@Override
	public void run(){
		String name= Thread.currentThread().getName();
		System.out.println("===================");
		System.out.println("Current thread "+ name);
		System.out.println(name + " acquired lock on " + obj1);
		synchronized(obj1){
			System.out.println(name + " acquired lock on " + obj1);
			work();
			System.out.println(name + " acquired lock on " + obj2);
			synchronized(obj2){
				System.out.println(name + " acquired lock on " + obj2);
				System.out.println("Lock Object 2");
				work();
			}
			System.out.println(name + " released lock on " + obj2);	
		}
		 System.out.println(name + " released lock on " + obj1);
		 System.out.println(name + " finished execution.");
	}
	
	private void work(){
		try{
		Thread.sleep(10000);
		}catch(InterruptedException ex){
			System.err.println(ex.getMessage());
		}
	}
}