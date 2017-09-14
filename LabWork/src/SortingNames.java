import java.util.Scanner;

public class SortingNames 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of Names: ");
		int n=sc.nextInt();
		String ar[]=new String[n];
		for(int i=0; i<n; i++)
		{
			ar[i]=sc.next();
			//System.out.println(ar[i]+"");
		}
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(ar[j].compareTo(ar[j+1])>0) // return positive if ar[j] is greater
				{
					String s=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=s;
				}
			}
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
