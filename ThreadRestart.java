/*Write a program to demonstrate that the thread once started can never be started again. Try, analyze the result */
package questions;

public class ThreadRestart {

	public static void main(String[] args)throws Exception {
		Runnable book = () ->{
			for(int i=1;i<=5;i++) {
				System.out.println("page " +i);
				try {Thread.sleep(2000);} catch (InterruptedException e) {}
			}
		};
		
		Thread t = new Thread(book);
		t.setName("book");
		
		t.start(); 
		if(t.isAlive()) {
			System.out.println("alive");
		}
		t.start();
		if(t.isAlive()) {
			System.out.println("alive");
		}

	}

}
