import java.util.Scanner;
class Cal
{
	public static void main(String args[])
	{
		System.out.println("CACULAToR");
		System.out.println("");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for divide");
		System.out.println("Press 3 for mul");
		System.out.println("Press 4 for subtraction");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise");
		int num = sc.nextInt();
		switch(num)
		{
			case 1:
			{
				System.out.println("Enter 1st number");
			    int a=sc.nextInt();
			    System.out.println("Enter 2nd number");
                int b=sc.nextInt();
				int c= a+b;
			    System.out.println("the result is"+c);
				break;
			}
			case 2:
			{
			System.out.println("Enter 1st number");
			    int a=sc.nextInt();
			    System.out.println("Enter 2nd number");
                int b=sc.nextInt();
				int c= a/b;
			    System.out.println("the result is"+c);
				break;	
			}
			case 3:
			{
				System.out.println("Enter 1st number");
			    int a=sc.nextInt();
			    System.out.println("Enter 2nd number");
                int b=sc.nextInt();
				int c= a*b;
			    System.out.println("the result is"+c);
				break;
			}
			case 4:
			{
				System.out.println("Enter 1st number");
			    int a=sc.nextInt();
			    System.out.println("Enter 2nd number");
                int b=sc.nextInt();
				int c= a-b;
			    System.out.println("the result is"+c);
				break;
			}
			default:
			{
				System.out.println("Default case");
			}  
		}
		
		
	}
}