import java.util.*;
public class sort
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		Node head=null;
		sortll s=new sortll();
		System.out.println("enter size");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			int t=sc.nextInt();
			head=s.insert(head,t);
		}
		head=s.sort(head);
		s.display(head);
	}
}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}

class sortll
{
	public Node insert(Node head,int data)
	{
		Node temp=new Node(data);
		if(head==null)
		{
			head=temp;
		}   
		else
		{
			Node temp1=head;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
	     }
		 return head;
	}
	
	public Node sort(Node head)
	{
		Node temp=head;
		Node temp2=head.next;
		while(temp.next!=null)
		{
			temp2=temp.next;
			while(temp2!=null)
			{
				if(temp.data > temp2.data)
				{
					int t=temp.data;
					temp.data=temp2.data;
					temp2.data=t;
				}
				temp2=temp2.next;
			}
			temp=temp.next;
		}
		return head;
	}
	
	public void display(Node head)
	{
		Node te=head;
		while(te!=null)
		{
			System.out.print(te.data+" ");
			te=te.next;
		}
	}
}