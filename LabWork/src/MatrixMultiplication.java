import java.util.Scanner;

public class MatrixMultiplication 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base of squared matrices: ");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
		int i=0,j=0,k=0;
		System.out.println("\nEnter the first matrix");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				for(k=0; k<n; k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication result");
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
