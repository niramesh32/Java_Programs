import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter it's value:");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		int size = arr.length;
		System.out.println("Array's size is:"+size);
	}
}