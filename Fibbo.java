import java.util.Scanner ;
class fibbo
{
	int n1=0,n2=1,n3,count,i;
	
	Scanner sc=new Scanner (System.in);
	
	void read ()
	{
		System.out.println("Enter value of count "+"\t");
		count =sc.nextInt ();
		System.out.println ("\n"+"fiboonasi series"+"\n");
		System.out.println(n1+" "+n2 );
	}
	void get()
	{
		for(i=2;i<count ;i++)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
}
public class Main {
	public static void main(String[] args) {
		fibbo f1=new fibbo();
		f1.read();
		f1.get();
		
		
	}
}
