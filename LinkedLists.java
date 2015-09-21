/* Linked list class */

public class Linked_List{
	private Node head;

	//constructor for an empty Linked List
	public Linked_List(){
		head = new Node(null);
	}

	//constructor for non-empty Linked List
	public Linked_list(Node node){
		head = node;
	}



}


/* Node class */

public class Node{
	private Object data;
	private Node next;

	//constructor for a node with no next value
	public Node(Object data){
		this.data = data;
		next = null;
	}

	//constructor for node with specified next value
	public Node(Object data, Node next){
		this.data = data;
		this.next = next;
	}
}
