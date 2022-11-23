class a1
{
	int a,b,c;
	void get()
	{
		a=2;
		b=20;
	}
}
class a2 extends a1
{
	int d,p;
	void get1()
	{
		System.out.println("multipication of given number ");
		d=a*b;
		System.out.println(d);
	}
}
class a3 extends a2
{
  
		void read()
		{
		p=10;
		System.out.println("value print for p : ");
		System.out.println(p);
	
		}
}
		
		
public class Main {
	public static void main(String[] args) {
		a3 a= new a3();
		a.get();
		a.get1();
		a.read();
		
	}
}

