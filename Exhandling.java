import java.util.Scanner;
class div
{
   public  static void main(String args[])
        {
  try
  {
    	  int a,b;

         Scanner sc=new Scanner(System.in);

         System.out.print(" Enter The First  Number\t");
         a=sc.nextInt();

         System.out.print("\n Enter The Second Number\t");
         b=sc.nextInt();

   System.out.print( a+" / "+b+" = "+a/b);

   }
   catch(ArithmeticException e)
   {
     System.out.println(" Number is not divide by zero\n\n");
   }
 }
}
