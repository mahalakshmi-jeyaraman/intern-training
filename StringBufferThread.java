/*create a class and extend the thread class.
 * override run() method of thread.
 * this is where the synchronized block of code will go.
 * for our three thread objects to share the same object, we will need to create a constructor that accepts StringBuffer object in the argument
 * the synchronized block of code will obtain a lock on the StringBuffer object within the block, 
 * output the StringBuffer 100 times and then increment the letter in the StringBuffer.
 * finally, in the main() method, create a single StringBuffer object using the letter A, 
 * then create three instances of our class and start all three of them.*/
package questions;

public class StringBufferThread {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("A");
		
		BufferThread t1 = new BufferThread(buffer);
		BufferThread t2 = new BufferThread(buffer);
		BufferThread t3 = new BufferThread(buffer);
		t1.start();
		t2.start();
		t3.start();
	}

}

class BufferThread extends Thread{
	StringBuffer buffer;
	public BufferThread(StringBuffer buffer) {
		this.buffer = buffer;
	}
	public void run() {
		synchronized(buffer) {
			for(int i=0;i<100;i++) {
				System.out.print(buffer);
//				buffer.setCharAt(0, (char)(buffer.charAt(0)+1));
			}
			buffer.setCharAt(0, (char)(buffer.charAt(0)+1));
			System.out.println();
		}
	}
}