import java.util.Scanner;
class Ques1
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your detils.");	
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter your name.");
			sc.next();
			String name= sc.nextLine();
			System.out.println("Enter your age.");
			int age =sc.nextInt();
			if(age>=18)
			{ 
		      System.out.println("you are eligible");
		     }
			 else
			 {
			System.out.println("you are not eligible");	 
			 }
		}
	}
}