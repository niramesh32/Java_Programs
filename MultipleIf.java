import java.util.Scanner;
class MultipleIf
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num<100 && num>=90)
		{
			System.out.println("1st Division");
		}
		else if (num<90 && num>=60)
		{
			System.out.println("2nd division");
		}
		else if(num<60 && num>=30)
		{
			System.out.println("3rd division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	
	
}