import java.util.Scanner;
class Ques2
{
	public static void main(String args[])
	{
		int age1=0;
		String name1="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your details");
		for(int i=0;i<10;i++)
		    {
			System.out.println("Enter your name");
			
			String name= sc.next();
		    name1=name;
			System.out.println("Enter your age");
			int age= sc.nextInt();
			age1= age;
		    }
	    System.out.println("name"+name1);
		System.out.println("age"+age1);
	}
}