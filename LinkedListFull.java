public class LinkedListFull
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
		if(head==null){
			head=node;}
		else
		{
			Node tmp=head;
			while(tmp.next!=null)
				tmp=tmp.next;
			tmp.next=node;
		}
	}
	public int listLength()
	{
		int len=0;
		Node tmp=head;
		while(tmp.next!=null)
		{
			len++;
			tmp=tmp.next;
		}
		return len;
	}
	public Node nthFromLast(Node node,int len,int n)
	{
		Node tmp=head;
		for(int i=0;i<=len-n;i++)
		{
			tmp=tmp.next;
		}
		return tmp;
	}
	public void printList()
	{
		Node tmp=head;
		while(tmp!=null)
		{
			System.out.print(tmp.value+" ");
			tmp=tmp.next;
		}
		//System.out.print(tmp.value+" ");
		System.out.println();		
	}
	public static void main(String[] args)
	{
		LinkedListFull list=new LinkedListFull();
		Node head=new Node(5);
		list.addLast(head);
		list.addLast(new Node(4));
		list.addLast(new Node(10));
		list.addLast(new Node(1));
		list.addLast(new Node(2));
		list.addLast(new Node(3));
		list.addLast(new Node(6));
		list.printList();
		int length=list.listLength();
		Node res=list.nthFromLast(head,length,3);
		System.out.println(res.value);
	}
}
