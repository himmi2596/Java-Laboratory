import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

// checked exception: compile time (need to throw for propagation)
// unchecked: runtime (propagates automatically)
public class ExceptionHandling 
{
	void a()throws ClassNotFoundException 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//shelly obj=new shelly();
		String s=null;
		s.length();
	}
	int a;
	void b()
	{
		try 
		{
		 a=1/0;
		}
		catch(ArithmeticException e)  // unchecked
		{
			System.out.println("arithmetic exceptioin");
		}
	}
	void c()
	{
		try 
		{
			
			a();
		}
		catch(NullPointerException e) //unchecked
		{
			System.out.println("Segmentation Fault");
		}
		catch(InputMismatchException e) //unchecked
		{
			System.out.println("wrong input type");
		}
		catch(ClassNotFoundException e)  //checked
		{
			System.out.println("class nhi mili");
		}
	}
	public static void main(String args[])
	{
		ExceptionHandling obj=new ExceptionHandling();
		obj.b();
		obj.c();
	}
}
