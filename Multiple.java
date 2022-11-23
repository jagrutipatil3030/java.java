//multiple inheritance using interface 
import java.util.Scanner;
interface demo
{
   void fun();
   
   
}
class demo1
{
	void out()
	{
	String s="abcd";
	System.out.println(s);
	System.out.println(s.endsWith("cd"));
		}
}
class demod3 extends demo1 implements demo
{
 public void fun()
	{
	System.out.println("used of interface ");
}
}
	
public class Main {
	public static void main(String[] args) {
		demod3 d1=new demod3();
		d1.out();
		d1.fun();
	}
}
