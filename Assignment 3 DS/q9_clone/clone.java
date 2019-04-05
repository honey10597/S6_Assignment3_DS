import java.util.*;
public class clone
{
	public static void main(String args[])
	{
		Node head = null;
		Demo d = new Demo();
		for(int i = 1;i <= 5;i++)
		{
			head = d.insert(head,i);
		}
		d.put(head);
		System.out.print("Elements in 1st linked list : ");
		d.display(head);
		System.out.print("\nElements in 2nd linked list : ");
		d.dis();
	}
}
class Node
{
	int data;
	Node next,prev;
	Node(int data)
	{
		this.data = data;
	}
}

class NewNode
{
	int d;
	NewNode n,p;
	NewNode(int d)
	{
		this.d=d;
	}
}
class Demo
{
	NewNode h = null;
	public Node insert(Node head,int d)
	{
		Node temp = new Node(d);
		if(head == null)
		{
			head = temp;
			head.prev = null;
		}else{
			Node t1 = head;
			while(t1.next!=null)
			{
				t1 = t1.next;
			}
			t1.next = temp;
			temp.prev = t1;
		}
		return head;
	}

	public void put(Node head)
	{
		Node t =head;
		while(t!=null)
		{
			NewNode t1 = new NewNode(t.data);
			if(h == null)
			{
				h = t1;
				h.n = null;
			}else{
				NewNode t2 = h;
				while(t2.n!=null)
				{
					t2=t2.n;
				}
				t2.n = t1;
				t1.p=t2;
			}
			t=t.next;
		}
	}

	public void dis()
	{
		NewNode t1 = h;
		while(t1!=null)
		{
			System.out.print(t1.d+" ");
			t1=t1.n;
		}
	}

	public void display(Node head)
	{
		Node t2 = head;
		while(t2 != null)
		{
			System.out.print(t2.data+" ");
			t2=t2.next;
		}
	}
}