public class LinkedList 
{
	private Node head;
	private static class Node
	{
		private int value;
		private Node next;
		Node(int value)
		{
			this.value=value;
		}
	}
	public void addLast(Node node)
	{
		if(head==null)
			head=node;
		else
		{
			Node tmp=head;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.next=node;
		}
	}
	public void printList()
	{
		Node tmp=head;
		while(tmp!=null)
		{
			System.out.print(tmp.value+" ");
			tmp=tmp.next;
		}
		System.out.println();
	}
	public Node nthFromLast(Node node,int n)
	{
		Node ptr1=head;
		Node ptr2=head;
		for(int i=0;i<=n-1;i++)
		{
			ptr1=ptr1.next;
		}
		while(ptr1.next!=null)
		{
			ptr1=ptr1.next;
			ptr2=ptr2.next;
		}
		return ptr2.next;
	}
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		Node head=new Node(5);
		list.addLast(head);
		list.addLast(new Node(4));
		list.addLast(new Node(10));
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(6));
		list.printList();
		Node res=list.nthFromLast(head,3);
		System.out.println(res.value);
	}
}
