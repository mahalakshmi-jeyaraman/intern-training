package day4;

public class Sample1 {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			
			System.exit(0);
		}catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	public static void main(String[] args) {
		Sample s = new Sample();
		s.mth1();

	}

}
//exit(0) -> successful termination
// exit(0) called with no exception -> finally block will not execute
//exit(0) called with exception -> finally will be executed