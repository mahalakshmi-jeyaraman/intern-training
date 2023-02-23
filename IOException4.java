package day4;

import java.util.Scanner;

public class IOException4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total_students = 10;
		int [] marks = new int[total_students];
		int index = 0,average = 0, sum = 0;
		int temp = total_students;
		while(temp>0 && index <10) {
			try {
				marks[index] = scan.nextInt();
				if(marks[index]<0) {
					throw new NegativeValue();
				}
				if(marks[index]<0 && marks[index]>100) {
					throw new ValueOutOfRange();
				}
			}catch(NegativeValue e) {
				System.out.println("do not give negative values");
			}
			catch(ValueOutOfRange e) {
				System.out.println("values out of range");
			}
			catch(Exception e)
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
class NegativeValue extends Exception{
	NegativeValue ()
	{
		System.out.println("...");
	}
}

class  ValueOutOfRange extends Exception{
	ValueOutOfRange()
	{
		System.out.println("...");
	}
}