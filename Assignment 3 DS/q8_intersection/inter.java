import java.util.*;
public class inter
{
	public static void main(String arhs[])
	{
		Scanner sc=new Scanner(System.in);

		Node1 head1=null;

		Node2 he=null;

		Demo d=new Demo();

		System.out.print("Enter size of 1st LinkedList : ");
		int s1=sc.nextInt();

		System.out.print("\nEnter size of 2nd LinkedList : ");
		int s2=sc.nextInt();

		System.out.print("\nEnter elements in 1st LinkedList : ");
		for(int i=1;i<=s1;i++)
		{
			int n1=sc.nextInt();
			head1=d.insert_in_first(head1,n1);
		}

		System.out.print("\nEnter elements in 2nd LinkedList : ");
		for(int i=1;i<=s2;i++)
		{
			int n2=sc.nextInt();
			he=d.insert_in_scnd(he,n2);
		}

		d.intt(head1,he);
	}
}


class Node1
{
	int data1;
	Node1 next1;
	Node1(int data1)
	{
		this.data1=data1;
	}
}

class Node2
{
	int dat;
	Node2 nex;
	Node2(int dat)
	{
		this.dat=dat;
	}
}

class Demo
{
	public Node1 insert_in_first(Node1 head1,int d1)
	{
		Node1 t1=new Node1(d1);
		if(head1==null)
			{
				head1=t1;
			}
			else
			{
				Node1 tt=head1;
				while(tt.next1!=null)
				{
					tt=tt.next1;
				}
				tt.next1=t1;
			}
			return head1;
	}
	

	public Node2 insert_in_scnd(Node2 he,int d2)
	{
		Node2 t1=new Node2(d2);
		if(he==null)
		{
			he=t1;
		}
		else
		{
			Node2 tt=he;
			while(tt.nex!=null)
			{
				tt=tt.nex;
			}
			tt.nex=t1;
		}
		return he;
	}


	public void intt(Node1 head1,Node2 he)
	{
		Node1 t1=head1;
		Node2 t2=he;

		while(t1!=null)
		{
			t2=he;
			while(t2!=null)
			{
				if(t1.data1 == t2.dat)
				{
					System.out.print(t1.data1+" ");
				}
				t2=t2.nex;
			}
			t1=t1.next1;
		}


		// while(t1!=null)
		// {
		// 	// if(t1.data1 == t2.data2)
		// 	// {
		// 		System.out.print(t1.data1+" ");
		// 	// }
		// 	t1=t1.next1;
		// 	// t2=t2.next2;
		// }
	}

}