//inner and outer class demonstration
import java.util.Scanner;
class outer
{
  class inner
   {
     void show()
     {

       System.out.println("used of inner and outer class");

      }
    }
 }
 class mainj1
 {
    public static void main(String args[])
    {
    outer.inner s1=new outer().new inner();
    s1.show();
    }
  }
