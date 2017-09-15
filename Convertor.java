import java.util.Scanner;
class Convertor
{
	public static void main(String args[])
	{  
	System.out.println("Convertor");
	System.out.println("");
	System.out.println("Press A to Convert C to F");
	System.out.println("Press B to Convert F to C");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your choice");
	String choice =sc.nextLine();
	switch(choice)
	{ 
	case "A":
	   {
	   
	   System.out.println("Enter your temp in calcious");
	   double num = sc.nextDouble();
	   double a = 1.8;
	   int b = 32;
	   double temp = num*a+b;
	   System.out.println("your temp in F will be "+temp);
	   }
	case "B":
	   {
		
		System.out.println("Enter your number in F.");
		double num = sc.nextDouble();
		int a =32;
		double b = 0.56;
		double temp=(num-a)*b;
		System.out.println("your temp in c will be "+temp);
	   }
	 default:
	 {
        System.out.println("ooopss, you have a wrong choice....!!!!"); 		 
	 }
	   
	}   
  }
}