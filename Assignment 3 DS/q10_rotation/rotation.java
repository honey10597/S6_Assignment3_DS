import java.util.*;
public class rotation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    Demo d = new Demo();
    for(int i=1;i<6;i++)
    {
      head = d.insert(head,i);
    }
    System.out.print("enter a no. to rotate : ");
    int n = sc.nextInt();
    d.display(n,head);
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

class Demo
{
  public Node insert(Node head,int d)
  {
    Node t1 = new Node(d);
    if(head == null)
    {
      head = t1;
    }else{
      Node t2=head;
      while(t2.next!=null)
      {
        t2 = t2.next;
      }
      t2.next = t1;
      t1.prev=t2;
    }
    return head;
  }
  public void display(int n,Node head)
  {
  	int c = 0;
  	if(c == n)
  	{
	    Node t1 = head;
	    while(t1!=null)
	    {
	      System.out.print(t1.data+" ");
	      t1=t1.next;
	    }
	}
	else {
		Node t2 = head;
		for(int i = 0;i<n;i++)
		{
			t2 = t2.next;
		}
	    while(t2!=null)
	    {
	      System.out.print(t2.data+" ");
	      t2=t2.next;
	    }

	    Node t = head;
	    for(int i = 0;i<n;i++)
		{
			System.out.print(t.data+" ");
			t = t.next;
		}

	}
  }

}