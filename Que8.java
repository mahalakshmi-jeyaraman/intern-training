package day2;
class SingletonClassExample  
{     
private static SingletonClassExample s = null;     
public String str;   
private SingletonClassExample()   
{   
str = "it is an example of singleton class.";   
}   
  
public static SingletonClassExample getInstance()   
{   
 
if (s== null)   
s = new SingletonClassExample();   
return s;   
}   
}  

public class Que8 {

	public static void main(String[] args) {
		SingletonClassExample a = SingletonClassExample.getInstance();
		SingletonClassExample b = SingletonClassExample.getInstance();
		SingletonClassExample c = SingletonClassExample.getInstance();
		a.str = (a.str).toUpperCase();
		System.out.println("String from a is " + a.str);
		System.out.println("String from b is " + b.str);
		System.out.println("String from c is " + c.str);

	}

}
