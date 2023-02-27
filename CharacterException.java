/*Write a class that keeps running total of all characters passed to it (one at a time) and
 *  throws an exception if it is passed a non-alphabetic character*/
package questions;

import java.util.Scanner;

public class CharacterException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Total t = new Total();
		try {
			for(int i=0;;i++) {
				t.passCharacter(scan.nextLine().charAt(0));
			}
		}catch(Exception e) {
			System.out.println("you are passing non-alphabetic character");
		}
		System.out.println("Running total : "+ t.printTotal());
	}

}

class Total{
	int total = 0;
	public void passCharacter(char c) throws Exception{
		if(!Character.isLetter(c)) {
			throw new Exception();
		}
		total++;
	}
	
	public int printTotal() {
		return total;
	}
}