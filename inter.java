import java .util.Scanner;
 interface no1
 {
 	void getdata();
 	
 }
 class form 
 {
     void show ()
    {
 
      System.out.println("...... table ........");
      System.out.println(\n\n);
 
     }
 }
class table extends form implements no1
{
	public void getdata()
	{
	      int i,n=5;
	   
	   for (i=1;i<=10;i++)
	   {
	   	  System.out.println(i*n);
	   }

	 }
}
public class inter {
	public static void main(String[] args) {
		
		 table t1=new table();
		  
		    t1.show();
		    t1.getdata();
			}
}
