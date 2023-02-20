package day2;

public class Que1b {
		int a = 10;
		void call(Que1b obj) {
			obj.a = obj.a+10;
		}
		public static void main(String[] args) {
			Que1b obj = new Que1b();
			System.out.println("before call-by-value "+obj.a);
			obj.call(obj);
			System.out.println("after call-by-value "+obj.a);
		}
	}


