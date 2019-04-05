import java.util.*;
public class q6_remove_duplicates
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Demo d=new Demo();
		System.out.println("Enter size : ");
		int size=sc.nextInt();
		Node head=null;
		for(int i=1;i<=size;i++)
		{
			int n=sc.nextInt();
			head=d.insert(head,n);
		}

		System.out.print("Elements before removing duplicates : ");
		d.display(head);

		System.out.print("\nElements after removing duplicates : ");
		head=d.remove(head);
		d.display(head);
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

class Demo
{
	public Node insert(Node head,int d)
	{
		Node temp=new Node(d);
		if(head == null)
		{
			head=temp;
		}
		else{
			Node temp1=head;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
		}

		return head;
	}

	public Node remove(Node head)
	{
		Node ptr=head;
		Node t1=null;
		Node t2=null;
		while(ptr!=null && ptr.next!=null)
		{
			t1=ptr;
			while(t1.next!=null)
			{
				if(ptr.data == t1.next.data)
				{
					Node hold=t1.next;
					t1.next=t1.next.next;
				}else
				t1=t1.next;
			}
			ptr=ptr.next;
		}
		return head;
	}

	public void display(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}