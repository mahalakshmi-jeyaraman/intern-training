/*try the following and observe the result.
 * also try it with a statement throwing some exception in line 1 */
package day4;

public class Sample {
	public void mth1()
	{
		mth2();
		System.out.println("caller");
	}
	public void mth2()
	{
		try
		{
			int i = 1/0;//line 1
			return;
		}catch(Exception e) {
			System.out.println("catch-mth2");
		}
		finally {
			System.out.println("finally-mth2");
		}
	}
	public static void main(String p[]) {
		Sample s = new Sample();
		s.mth1();
	}
}
