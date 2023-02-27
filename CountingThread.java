/*create a simple counting thread. It will count to 100, pausing one second between each number.  
 * also, in keeping with the counting theme, it will output a string*/
package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountingThread {

	public static void main(String[] args) {
		CountThread ct = new CountThread();
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		es.execute(() ->{										  
			Thread.currentThread();
				synchronized(ct) {
					ct.count();
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}			
		});
	}

}
class CountThread{
	public void count() {
		for(int i=1;i<=100;i++) {
			System.out.print(i+ " ");
			if(i%10 == 0) {
				System.out.println("break");
			}
		}
	}
}