class over
{
	int a,b,c;
	void get()
	{
		a=10;
		b=20;
	}
}
	class over2 extends over
	{
		
	void get()
	{
	super.get();
	System.out.println(a);
	System.out.println(b);
	c=a+b;
	System.out.println("Addition of two number ");
	System.out.println(c);
		}
	}
public class override {
	public static void main(String[] args) {
		over2 b2= new over2();
		b2.get();
		
	}
}
