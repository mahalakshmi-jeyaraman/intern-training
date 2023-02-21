//Write a program to prove that primitive data types are passed by value and 
//object and arrays are passed by reference
package day2;

public class Que1a {
	int a = 10;
	void call(int a) {
		a = a+10;
	}
	public static void main(String[] args) {
		Que1a obj = new Que1a();
		System.out.println("before call-by-value "+obj.a);
		System.out.println("after call-by-value "+obj.a);
	}

}
