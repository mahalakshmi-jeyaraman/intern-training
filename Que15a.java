//Write a program to generate a prime number list between 1 to 100
package day1;

public class Que15a {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			int count = 0;
			for(int j=2;j<=100;j++) {
				if(i%j==0) {
					count++;
				}	
			}
			if(count == 1) {
				System.out.println(i);
			}
		}
	}

}
