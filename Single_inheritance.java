//single inheritance
import java .util.Scanner;
class a
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	void get()
	{
		System.out.println("value of a : ");
		a=sc.nextInt();
		
		System.out.println("value of b : ");
		b=sc.nextInt();
	}
}
	class b extends a
	{
		int c;
		void show()
		{
			c=a+b;
			System.out.println("\n Addition of the given number");
			System.out.println(c);
		}
	}
			
public class Main {
	public static void main(String[] args) {
		b b1=new b(); // create object of derived class always 
		b1.get();
		b1.show();
		
	}
}
