//Write a program to print default values of all primitive types
package day1;

public class Que2 {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	String str;
	public static void main(String[] args) {
		Que2 dv = new Que2(); 
		
		System.out.println("the default value of byte is "+dv.b);
		
		System.out.println("the default value of short is "+dv.s);
		
		System.out.println("the default value of int is "+dv.i);
		
		System.out.println("the default value of long is "+dv.l);
		
		System.out.println("the default value of float is "+dv.f);
		
		System.out.println("the default value of double is "+dv.d);
		
		System.out.println("the default value of boolean is "+dv.bool);
		
		System.out.println("the default value of char is "+dv.c);
		
		System.out.println("the default value of String is "+dv.str);
		
	}

}
