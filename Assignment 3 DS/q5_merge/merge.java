import java.util.*;
public class merge
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		Node head=null;
		Node2 he=null;
		for(int i=1;i<=5;i++)
		{
			head=d.insert_at_end(head,i);
		}
		for(int i=10;i<=15;i++)
		{
			he=d.insert(he,i);
		}
		System.out.print("Elements in 1st Linklist : "); d.dis1(head);
		System.out.print("\nElements in 2nd Linklist : "); d.dis2(he);
		head=d.merge(head,he);
		System.out.print("\nElements after merging in single Linklist : ");  d.dis1(head);
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


class Node2
{
	int d;
	Node2 ne;
	Node2(int d)
	{
		this.d=d;
	}
}
class Demo
{
	public Node insert_at_end(Node head,int data)
	{
		Node t1=new Node(data);
		if(head == null)
		{
			head=t1;
		}else{
			Node t2=head;
			while(t2.next!=null)
			{
				t2=t2.next;
			}
			t2.next=t1;
		}
		return head;
	}

	public Node2 insert(Node2 he,int dd)
	{
		Node2 t2=new Node2(dd);
		if(he == null)
		{
			he=t2;
		}
		else
		{
			Node2 t=he;
			while(t.ne!=null)
			{
				t=t.ne;
			}
			t.ne=t2;
		}
		return he;
	}

	public Node merge(Node head,Node2 he)
	{
		Node2 tt=he;
		while(tt!=null)
		{
			head=insert_at_end(head,tt.d);
			tt=tt.ne;
		}
		return head;
	}

	public void dis1(Node head)
	{
		Node temp1=head;
		while(temp1!=null)
		{
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}

	public void dis2(Node2 he)
	{
		Node2 te=he;
		while(te!=null)
		{
			System.out.print(te.d+" ");
			te=te.ne;
		}
	}
}