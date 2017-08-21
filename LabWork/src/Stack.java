import java.util.*;
public class Stack 
{
	private static int size=0;
	private int ar[]=new int[10];
	private int top=-1;
	
	public void push(int n)
	{
		if(!isFull())
		{
			ar[++top]=n;
			size++;
		}
		else
			System.out.println("Stack Full");
	}
	public void pop()
	{
		if(!isEmpty())
		{
			System.out.println("popped element:"+ ar[top--] );
			size--;
		}
		else
			System.out.println("Stack Empty");
		
	}
	public void display()
	{
		for(int i=0; i<size; i++)
		{
			System.out.println(ar[i]+" ");
		}
	}
	public void topValue()
	{
		System.out.println("Top Element:"+ar[top]);
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	boolean isFull()
	{
		if(size>10)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Stack obj=new Stack();
		while(true)
		{
			System.out.println("Enter Your Choice: 1.Push 2.Pop 3.Display 4.Value on Top 5.Exit");
			int a=sc.nextInt();
			switch(a)
			{
			case 1:
				System.out.print("Enter the element to push:");
				int n=sc.nextInt();
				obj.push(n);
				break;
			case 2:
				obj.pop();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.topValue();
				break;
			case 5:
				System.exit(0);
			}
		}
	}
}
