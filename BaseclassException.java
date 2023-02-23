package day4;

public class BaseclassException {

	public static void main(String[] args) {
		int a = 10, b = 0;
		int c = 0;
		c = a/b;
		System.out.println(c);
		int [] arr = null;
		System.out.println(arr[1]);
		try{
			
			c = a/b;
		}catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}

	}

}
//null pointer exception is not caught -> NullPointerException is under java.lang
//because 