import java .util. Scanner;
class demo 
{ 
int a,b;
 void getdata()
 {
 
 Scanner sc=new Scanner(System.in);
 
System.out.println("enter the no");
 a= sc.nextInt();
 
 System.out.println("second number");
 b=sc.nextInt();
 }
 void putdata()
 {
 	int c;
 	System.out.println(".....addition of two no.......");
 	c=a+b;
 	System.out.println(c);
 }
}

public class Main {
	
	public static void main(String[] args) {
		demo j =new demo();
		j.getdata();
		j.putdata();
		
		
		
	}
}
