import java.util.Scanner;
class node  
{
	int data;
	node next;


	public node()
	{
		data=0;
		node next=null;
	}
	public node(int value) 
	{
		next=null;
		data=value;
	}
	public node begin(node start,int data)
	{
		node temp=new node(data);

		if(start==null)
		{
			start=temp;
		}
		else
		{
			temp.next=start;
			start=temp;
		}

		return start;
	}

	public node display(node start)
	{
		node temp=start;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		
		}
		return start;
	}
}
class LinkedList
{
	public static void main(String args[])
	{
		node obj=new node();

		node start=null;
		int value;
		Scanner s=new Scanner(System.in);
		value=s.nextInt();
		start=obj.begin(start,value);
		do{
			value=s.nextInt();
			start=obj.begin(start,value);
		}while(value!=-1);
		start=obj.display(start);
		start=obj.display(start);
	}
}