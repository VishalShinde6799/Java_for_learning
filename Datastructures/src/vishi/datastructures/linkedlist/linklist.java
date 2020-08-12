package vishi.datastructures.linkedlist;

public class linklist {
	node head;
	public void insert(int data)
	{
		node Node = new node();
		Node.data = data;
		Node.next = null;
		if(head == null)
		{
			head = Node;
		}
		else
		{
			node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = Node;
		}
	}	
	public void insertmid(int data, int key)
	{
		node new_Node = new node();
		new_Node.data = data;
		node n = new node();
		n = head;
			while(n.data != key)
			{
				n = n.next;
			}
			new_Node.next = n.next;
			n.next = new_Node;
		}
	public void delnode(int data)
	{
		node n = head;
		if(head.data == data)
		{
			head = head.next;
		}
		else 
		{
		while(n.next.data != data)
		{
			n = n.next;
		}
		n.next= n.next.next;
		}	
	}
	public void show()
{
	node Node = head;
	while(Node.next != null)
	{
		System.out.println(Node.data);
		Node = Node.next;
	}
	System.out.println(Node.data);
}
	public void find(int data) 
	{
		node n = new node();
		node temp = new node();
		n = head;
		int count1 = 1;
		if(head.data == data)
		{
			System.out.println("it's head");
		}
		else 
		{
			while (n.next != null) 
			{
				temp = n;
				n = n.next;
				count1 +=1;
				
				if (n.data == data) 
				{
					System.out.println("found at: " +count1 + " after " +temp.data);
					break;
				} 
				else if (n.next == null)
					System.out.println("end of the list");
			} 
		}
		
	}
	public void sort()
	{
		
	}
}
