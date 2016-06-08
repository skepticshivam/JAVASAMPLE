import java.util.Scanner;
public class Array
{
	public static void main(String args[])
	{
		int[] a=new int[10];
		int i;
		Scanner read=new Scanner(System.in);
		System.out.print("Enter the size of array");
		int n=read.nextInt();
		for(i=0;i<n;i++)
		{	Scanner reader=new Scanner(System.in);
			System.out.print("enter the "+(i+1)+"number");
			a[i]=reader.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.print("Arry is:"+a[i]);
		}
	}	
}
