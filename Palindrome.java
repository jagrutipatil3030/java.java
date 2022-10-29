// check no is palindrom or not
import java.util.Scanner;
class demo
{
	int sum,d,no,temp;
	Scanner sc =new Scanner (System.in);
	void get()
	{
		System.out.println("Enter the number "+" \n");
		no=sc.nextInt();
		temp=no;
	}
	void put()
	{
		sum=0;
		while(no>0)
		{
			d=no%10;
			sum=sum*10+d;
			no=no/10;
		}
		if (temp==sum)
		{
			System.out.println( "\n"+"   Given Number is palindrom ");
		}
		else 
		{
		System.out.println("\n"+" Given number is not palindrom");
		}
	}
}
public class Main {
	
	public static void main(String[] args) {
		demo d1=new demo();
		d1.get();
		d1.put();
		
	}
}
