import java.util.*;
class demo
{
	int a,b,c,d,e;
 void demo(int x,int y)
	{
		a=x;
		b=y;
				System.out.println("\n________ Addition ________\n");
		System.out.println("\n\nValue of a \t"+a);
		System.out.println("Value of a \t"+b);
				
		System.out.println("\nAddition of Two Number ");
		System.out.println(a+b);
	}
	void demo(int l, int m, int n)
	{
		c=l;
		d=m;
		e=n;
		System.out.println("\n_______ Multiplication ________\n");
		System.out.println("\n\nValue of a \t"+c);
		System.out.println("Value of a \t"+d);
		System.out.println("Value of a \t"+e);
	    System.out.println("\nMultiplication  of  Three  Number ");
		System.out.println(c*d*e);
	}
}
public class Main {
	public static void main(String[] args) {
		 demo d1=new demo();
		 d1.demo(10,20);
		 d1.demo(2,2,2);
		
		
	}
}
