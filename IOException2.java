package day4;
import java.util.*;
public class IOException2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int numerator = scan.nextInt();
			try {
				if(numerator == 'q' && numerator == 'Q')
					System.exit(0);
			}catch(Exception e) {
				
			}
			int divisor = scan.nextInt();
			int result = 0;
			
			try { 
				result = numerator / divisor;
				System.out.println(result);

			}catch(Exception e){
				System.out.println(e);
			}		
		}	
	}
}
