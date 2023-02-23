/*create your own exception.
 * in main() create a try catch clause to exercise your new exception*/
package day4;

public class OwnException {

	public static void main(String[] args) {
		int sonAge = 20;
		int fatherAge = 10;
		try {
			if (sonAge > fatherAge) {
				throw new WrongAgeException(fatherAge-sonAge);
			}
		}catch(WrongAgeException e) {
			System.out.println("age of father is incorrect");
		}
		

	}

}
class WrongAgeException extends Exception{
	int age;
	WrongAgeException(int age){
		this.age = age;
	}
}