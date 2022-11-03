import java.util.Scanner;
class demo
{
 int i,j,no=5,m,n;
   demo()
   {
    for(i=1;i<=10;i++)
    {
     for(j=1;j<=no;j++)
     {
       System.out.print(i*j+"\t");
      }
      System.out.println();
     }
 }
 void getdata()
 {
	 for(m=1;m<=5;m++)
	 {
		 for(n=1;n<=m;n++)
		 {
			 System.out.print("*");
		 }
		 System.out.println("\n");
	}
}
 protected void finalize()
 {
  System.out.println("\n\n\nObject is Destroy by Garabge Collector");
 }
}
public class fine
{
   public static void main(String args[])
   {

    demo d1=new demo();
    d1.finalize();
    d1.getdata();
    }
  }
