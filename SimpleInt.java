import java.util.Scanner;
class SimpleInt
{
	public static void main(String args[])
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please, enter your salary");
		int sal = sc.nextInt();
		if(sal>=30000 && sal<60000)
		{
			double a=0.06;
			double b= sal*a;
			System.out.println("you have to pay this amount as Tax."+b);
		}
		
		else if(sal>=60000 && sal<100000)
		{
			double a=0.16;
			double b=sal*a;
			System.out.println("you have to pay this amount as Tax."+b);
		}
		else if(sal>10000)
		{
			double a=0.25;
			double b=a*sal;
			System.out.println("you have to pay this amount as Tax."+b);
		}
		else
		{
			System.out.println("Be happy,you don't have need to pay Tax(._.)");
		}
	}
}