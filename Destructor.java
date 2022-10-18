class demo
 {
  demo(int x)
  {
   System.out.println(x);
  }
  protected void finalize()
  {
   System.out.println("\nObject is destroyed by the Garbage Collector\n");
  }
 }
 public class Destructor
 {
  public static void main(String  args[])
  {
   demo de=new demo(23);
   de.finalize();
   de=null;
   System.out.println("inside the main()method\n\n\n");
   }
  }
