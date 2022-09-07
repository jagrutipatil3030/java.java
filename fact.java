import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int i,n ,fact=1;
		
		 System.out.println("Enter the number :-");
		 Scanner sc=new Scanner (System.in);
		 n=sc.nextInt();
		 System.out.println("\n");
		 
		 System .out.println("factorial of given number");
		 for(i=1;i<=n;i++)
		 {
		 	fact=fact*i;
		 	System.out.println(fact);
	}	
	}
}
