import java.util.*;
public class InterfaceExample implements Queue 
{	
	int front=-1;
	int end=-1;
	int ar[]=new int[100];
	int size=100;
	public void enqueue(int n)
	{
		if(!isFull())
		{
			if(end==-1)
				front++;
			end++;
			ar[end]=n;
		}
		else
			System.out.println("Full");
	}
	public void dequeue()
	{
		if(!isEmpty())
		{
			System.out.println("Dequeue Element is "+ar[front]);
			front++;
		}
		else
			System.out.println("Empty");
	}
	void display()
	{
		for(int i=front; i<=end; i++)
		{
			
			System.out.print(ar[i]+" ");
		}
	}
	void atFront()
	{
		System.out.println("Element in Front is "+ar[front]);
	}
	boolean isEmpty()
	{
		if(front>end || (front==-1 && end==-1) )
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(end==size-1)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		InterfaceExample obj=new InterfaceExample();
		while(true)
		{
			System.out.println("\nEnter Your Choice: 1.Enqueue 2.Dequeue 3.Display 4.Value at Front 5.Exit");
			int a=sc.nextInt();
			switch(a)
			{
				case 1:
					System.out.print("Enter the element to push:");
					int n=sc.nextInt();
					obj.enqueue(n);
					break;
				case 2:
					obj.dequeue();
					break;
				case 3:
					obj.display();
					break;
				case 4:
					obj.atFront();
					break;
				case 5:
					sc.close();
					System.exit(1);
			}
		}
	}
}
