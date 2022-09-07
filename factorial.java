import java.util.Scanner;
class fact 
{
	int n,i,fact=1;
	void show()
	{ 
       	Scanner sc=new Scanner(System.in);
	
	        System.out.println("Enter the number as per your choice");
        	n=sc.nextInt();
		
       	System.out.println("\n");
	
   		System.out.println("factoril of given number is");
		
   	for(i=1;i<=n;i++)
	{
		     fact=fact*i;
		    System.out.println(fact);
	}
	}
}
public class factorial{
	public static void main(String[] args) {
		     fact f=new fact();
	     	f.show();
	}
	}
