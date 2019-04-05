import java.util.*;
public class q1_palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Singly s=new Singly();
		Node head=null;
		Node2 head2=null;
		System.out.println("enter size");
		int size=sc.nextInt();
		System.out.println("\nenter characters");
		for(int i=1;i<=size;i++)
		{
			char ch=sc.next().charAt(0);
			head=s.insert(head,ch);
		}
		head2=s.reverse(head,head2);
		s.prove(head,head2);
	}
}
class Node 
{
	char ch;
	Node next;
	Node(char ch)
	{
		this.ch=ch;
	}
}

class Node2 
{
	char ch2;
	Node2 next2;
	Node2(char ch2)
	{
		this.ch2=ch2;
	}
}


class Singly
{
	public Node insert(Node head,char ch)
	{
		Node temp=new Node(ch);
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
	
	public Node2 reverse(Node head,Node2 head2)
	{
		Node current=head;
		Node pre=null;
		Node te=null;
		while(current!=null)
		{
			te=current.next;
			current.next=pre;
			pre=current;
			current=te;
		}head=pre;
		
		Node t=head; 
		while(t!=null)
		{
			Node2 t2=new Node2(t.ch);
			if(head2 == null)
			{
				head2=t2;
			}else{
				Node2 tn=head2;
				while(tn.next2!=null)
				{
					tn=tn.next2;
				}
				tn.next2=t2;
			}
			t=t.next;
		}
		
		Node current1=head;
		Node pre1=null;
		Node te1=null;
		while(current1!=null)
		{
			te1=current1.next;
			current1.next=pre1;
			pre1=current1;
			current1=te1;
		}head=pre1;
		
		return head2;
	}
	public void prove(Node head,Node2 head2)
	{
		int f=1;
		Node2 tq=head2;
		Node te=head;
		while( tq!=null && te!=null)
		{
			if(te.ch == tq.ch2)
			{
				f=1;
			}
			else{
				f=0;
				break;
			}
			// System.out.print(tq.ch2+" ");
			te=te.next;
			tq=tq.next2;
		}
		
		if(f==1){System.out.println("palindrome");}
		else{System.out.println("Not palindrome");}
	}
	
}