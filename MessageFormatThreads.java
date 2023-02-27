/*Write a program to give synchronized access to multiple thread each with different message to display method which formats the message in the following manner. "[------Message-----]"*/
package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MessageFormatThreads {

	public static void main(String[] args) {
		PrintMessage printmessage = new PrintMessage();
		ExecutorService es = Executors.newFixedThreadPool(3);   
		
		es.execute(() ->{										  
			Thread.currentThread();
			for(int i=0;i<3;i++) {
				synchronized(printmessage) {
					printmessage.printMessage();
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			}
			
		});
		
		es.execute(() ->{										  
			Thread.currentThread();
			for(int i =0;i<3;i++) {
				synchronized(printmessage) {
					printmessage.printMessage();
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						
					}
				}
			}
			
		});
		
		es.execute(() ->{										  
			Thread.currentThread();
			for(int i=0;i<3;i++) {
				synchronized(printmessage) {
					printmessage.printMessage();
					try {
						Thread.sleep(1500);
					}catch(Exception e) {
						
					}
				}
			}
		});
	}

}

class PrintMessage{
	int i;
	public synchronized void printMessage() {
		i++;
		System.out.println("[------Message "+i+"------]");
	}
}