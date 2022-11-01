
public class wrapper{
	public static void main(String[] args) {
		byte  b=10;
		int i=40;
        short s=20;
		float f=50.0f;
		
		System.out.println(" _____ printing value ______");
    	System.out.println("\n  print float Value\t "+ f);
    	System.out.println("  print charector\t "+ s);
    	System.out.println("  print integer Value\t " +i);
    	System.out.println("  print byte Value\t "+ b);
    	
    	Byte Byteobj=b;
    	Integer Intobj=i;
    	Short Shortobj=s;
    	Float Floatobj=f;
    	System.out.println("\n________ Autoboxing converting primitive into object ______");
    	
    	System.out.println("\n Float object\t" +Floatobj);
    	System.out.println("\n Integer object\t" +Intobj);
		System.out.println("\n Short object\t" +Shortobj);
		System.out.println("\n Float object\t" +Floatobj);
		
		byte bytevalue=Byteobj;
		short shortvalue=Shortobj;
		int intvalue=Intobj;
		float floatvalue=Floatobj;
		
	System.out.println("\n________ unboboxing converting primitive  _________");

 	   System.out.println("\n Float Value\t" +floatvalue);
    	System.out.println("\n Integer Value\t" +intvalue);
		System.out.println("\n Short Value\t" +shortvalue);
		System.out.println("\n Byte Value\t" +bytevalue);
	
			}
				}
