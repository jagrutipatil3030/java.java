import java.util.Scanner;
class demo
{
   int no ,r,sum=0,temp;
   Scanner sc=new Scanner (System.in);
	
 void get()
	{
          System.out.println("Enter number");
	  no=sc.nextInt();
	  temp=no;
	}
	void red()
	{
          sum=0;

        while (no>0)
		{
                  r=no%10;
                  sum=sum+r*r*r;
		  no=no/10;
                }
         if (temp==sum)
		 {
	 	   System.out.println("number  is armstrong ");
		 }
	
           else 
 		{
		 System.out.println("number is not armstrong ");
		}
       }
}
public class main()
 {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.get();
		d1.red();
	}
}
