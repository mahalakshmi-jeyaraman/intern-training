package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OddEvenThread {
	
	public static void main(String[] args) {
		
		PrintOddEven oddeven = new PrintOddEven();                //object creation
		ExecutorService es = Executors.newFixedThreadPool(2);     //thread creation
		
		es.execute(() ->{										  
			Thread.currentThread().setName("odd");
			synchronized(oddeven) {
				oddeven.printOdd(100);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
		});
		
		es.execute(() ->{
			Thread.currentThread().setName("even");
			synchronized(oddeven) {
				oddeven.printEven(100);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					
				}
			}
		});
	}

}

class PrintOddEven{
	
	public void printOdd(int n){ 
		for(int i=1;i<=n;) {
			System.out.print(i +" ");
			i=i+2;
		}
		System.out.println();
	}
	
	public void printEven(int n){
		for(int i=2;i<=n;) {
			System.out.print(i+" ");
			i=i+2;
		}
		System.out.println();
	}
}
	
