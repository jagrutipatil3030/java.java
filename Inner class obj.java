// addition using inner & outer class
import java.util.Scanner;
class outer
{
    public void show()
   {
   class inner

   {


     public void getdata()

     {
        int a,b;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the value of A : ");
        a=s.nextInt();

        System.out.println("Enter the value of B : ");
        b=s.nextInt();

        System.out.println("\n");
        System.out.println(" value of A " +a);
        System.out.println(" value of B " +b);

        System.out.println("\n");
        System.out.println("addition of two number");
        System.out.println(a+b);
        System.out.println("\n\n\n\n");
       }

      }

       inner in=new inner();
       in.getdata();
       }
   }
   public class inout

   {

    public static void main(String args[])

        {
           outer s1=new outer();
           s1.show();
	   }
   }
