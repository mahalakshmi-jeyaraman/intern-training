/*Create a class with a method throwing an object of class IOException.
 * Neither catch this object nor use throws clause.
 * Test and see the result*/

package day4;
import java.util.*;
public class IOException {
	public static void ioException() {
		System.out.println("give an integer input..");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		scan.ioException();	
	}
}
