/*Write a program which displays digital clock*/
package questions;

import java.time.LocalDateTime;
//import java.util.Date;

public class DigitalClock {

	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
		LocalDateTime localdatetime = LocalDateTime.now();
		System.out.println(localdatetime);
	}

}
