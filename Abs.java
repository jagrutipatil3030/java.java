abstract class a
{
       	int a=10,b=5;
		abstract void read ();
}
class b extends a
{

	void read ()
	{
		System.out.println( a+b);
	}
}
public class Main {
	public static void main(String[] args) {
		a obj=new b();
		obj.read();		
	}
}
