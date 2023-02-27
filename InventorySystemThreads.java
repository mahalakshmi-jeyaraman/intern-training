/*Write a program to implement inventory system in which two thread called producer will add one product in the inventory and 
 * other thread called consumer will consume product from inventory. 
 * thread should communicate in such a way that
 * there should be maximum one product and minimum zero products in the inventory*/
package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventorySystemThreads {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Inventory invent = new Inventory();
		
		es.execute(()->{
			for(int i=0;i<5;i++) {
				invent.produce();
			}
		});
		
		es.execute(()->{
			for(int i=0;i<5;i++) {
				invent.consume();
			}
		});
		
		es.shutdown();
	}

}

class Inventory{
	boolean flag = false;
	
	synchronized public void produce() {
		if(flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("add one product...");
		flag=true;
		notify();
	}
	
	synchronized public void consume() {
		if(!flag) {
			try{wait();}catch(Exception e) {}
		}
		System.out.println("consume one product...");
		flag=false;
		notify();
	}
	
}