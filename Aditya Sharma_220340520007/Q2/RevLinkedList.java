class ReverseLL{
	static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node reverse(Node node){
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	void display(Node node){
		while(node!=null){
			System.out.print(node.data+"->");
			node = node.next;
		}
	}
	public static void main(String... args){
		ReverseLL list = new ReverseLL();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		
		System.out.println("Linked List that is to reversed");
		list.display(head);
		
		head = list.reverse(head);
		System.out.println();
		
		System.out.println("Linked List after reverse ");
		list.display(head);
		
	}
}
