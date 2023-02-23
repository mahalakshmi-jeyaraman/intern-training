package day4;
import java.util.*;
public class IOException3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total_students = 10;
		int [] marks = new int[total_students];
		int index = 0,average = 0, sum = 0;
		int temp = total_students;
		while(temp>0 && index <10) {
			try {
				marks[index] = scan.nextInt();
			}catch(Exception e)
			{
				System.out.println("give an integer as input");
			}
			finally {
				sum += marks[index];
				temp--;
				index++;
			}
		}
		average = sum /total_students;
		System.out.println(average);
		scan.close();
	}

}
