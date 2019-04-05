import java.util.*;
public class del_alt_nodes
{
	public static void main(String args[])
	{
		Demo d=new Demo();
		Node head=null;
		for(int i=1;i<9;i++)
		{
			head=d.ins_at_end(head,i);
		}
		System.out.print("Elements before deletion : ");
		d.display(head);
		head=d.delete_alt(head);
		System.out.print("\nElements before deletion : ");
		d.display(head);
	}
}
class Node
{
	int data;
	Node next,prev;
	Node(int data)
	{
		this.data=data;
	}
}

class Demo
{
	public Node ins_at_end(Node head,int d)
	{
		Node temp=new Node(d);
		if(head == null)
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
			temp.prev=temp1;
		}
		return head;
	}

	public Node delete_alt(Node head)
	{
		Node t=head;
		int c=0;
		while(t!=null)
		{
			if(c%2 != 0)
			{
				head=delete(head,t.data);
			}
			c++;
			t=t.next;
		}
		return head;
	}

	public Node delete(Node head,int d)
	{
		Node t1=head;
		while(t1!=null)
		{
			if(t1.data == d)
			{
				if(t1.next!=null)
				{
					t1.prev.next=t1.next;
				}else{
					t1.prev.next=null;
				}
			}
			t1=t1.next;
		}
		return head;
	}

	public void display(Node head)
	{
		if(head == null)
		{
			System.out.print("Linklist is empty");
		}
		Node temp1=head;
		while(temp1!=null)
		{
			System.out.print(temp1.data+" ");
			temp1=temp1.next;
		}
	}
}