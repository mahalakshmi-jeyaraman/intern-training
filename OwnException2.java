/*write a lass with a method that throws an exception of the type 
 * created in previous exercise.
 * Compile this without catch the exception
 * */
package day4;

public class OwnException2 {

	public static void main(String[] args) {
		int sonAge = 20;
		int fatherAge = 10;
		try {
			if (sonAge > fatherAge) {
				throw new WrongAgeException(fatherAge-sonAge);
			}
		}
		catch(WrongAgeException e) {
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