import java.util.Scanner;
interface method
{
	void read();
	void calu();
}
class num implements method
{
	int a,b,c;
	Scanner s=new Scanner (System.in);
	public void read()
	{
		System.out.print("\n Enter 1st number ");
		a=s.nextInt();
		System.out.print(" Enter 2nd Number ");
		b=s.nextInt();
	}
	public void calu()
	{
		c=a+b;
		System.out.println("\n Addition of Two number is :- " +c );
	}
}


public class Main {
	public static void main(String[] args) {
		num n=new num();
		n.read();
		n.calu();
		
	}
}
