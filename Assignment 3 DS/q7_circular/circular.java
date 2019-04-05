import java.util.*;

public class circular
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size : ");
		int size=sc.nextInt();
		Demo d=new Demo();

		Node head=null;
		
		System.out.print("\nEnter numbers : ");
		for(int i=1;i<=size;i++)
		{
			int n=sc.nextInt();
			head = d.insert(head,n);
		}
		System.out.print("\nEnter value from print : ");
		int n1=sc.nextInt();
		d.display(head,n1);
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
			head = temp;
			temp.next = head;
		}else{
			Node t1 = head;
			while(t1.next != head)
			{
				t1=t1.next;
			}
			t1.next = temp;
			temp.next = head;
		}
		return head;
	}

	public void display(Node head,int num)
	{
		Node temp = head;
		Node tn = null;
		if(head.data == num)
		{
			while(temp.next!=head)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
		else{

			temp=head.next;
			while(temp!=head)
			{
				if(temp.data == num)
				{
					tn = temp;
					break;
				}else{
					temp=temp.next;
				}
			}

			while(temp.next!=tn)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.print(temp.data);
		}
	}
}
