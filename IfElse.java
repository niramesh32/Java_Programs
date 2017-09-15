import java.util.Scanner;
class IfElse 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num>100)
		{
			System.out.println("Allowed!!!");
		}
		else
		{
			System.out.println("Not Allowed!");
		}
	}
}