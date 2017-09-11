// search number in array
import java.util.*;
public class ArrayInThread implements Runnable
{
	String threadName;
	Thread t;
	int ar[];
	public ArrayInThread(String s) 
	{
		threadName=s;
		ar=new int[10];
	}
	public void run()
	{
		try
		{
			Random r=new Random();
			for(int i=0; i<10; i++)
			{
				ar[i]=r.nextInt(50);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void start()
	{
		try
		{
			t=new Thread(this,threadName);
			t.start();
			t.join(); // to see the completion of thread is done 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayInThread obj=new ArrayInThread("I am Thread");
		obj.start();
		System.out.println("Enter any Number");
		int a=sc.nextInt();
		for(int p:obj.ar)
		{
			if(a==p)
			{
				System.out.println("Present");
				sc.close();
				System.exit(1);
			}
			System.out.println(p);
		}
		System.out.println("Absent");
	}
}
