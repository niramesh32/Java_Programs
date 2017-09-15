import java.util.Scanner;
class Cond
{
	public static void main(String args[])
	{
		System.out.println("EVEN ODD CHECKER");
		System.out.println("");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num%2==0)
		{ 
	         System.out.println("this is a even number.");
	    }
	    else
	    {
		     System.out.println("this is a odd number");
	    }
	}
}