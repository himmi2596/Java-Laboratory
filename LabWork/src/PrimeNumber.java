import java.lang.reflect.Array;
import java.util.*;

public class PrimeNumber 
{
	void prime(int n)
	{
		int ar[]=new int[100001];
		System.out.print("Prime Numbers are ");
		for(int i=2; i<=n; i++)
		{
			if(ar[i]==0)
			{
				System.out.print(i+" ");
				ar[i]=1;
				for(int j=i*i; j<=n; j+=i)
				{
					ar[j]=1;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		PrimeNumber obj=new PrimeNumber();
		obj.prime(n);
	}
}
