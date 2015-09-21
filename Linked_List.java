/*
 *  Java Implementation of Linked List Data Structure
 *  @author: Anastasiya Tarnouskaya
 *
 */


/* Linked list class */

public class Linked_List{
    private Linked_List_Node head;

    //constructor for an empty Linked List
    public Linked_List(){
        head = null;
    }

    //constructor for non-empty Linked List
    public Linked_List(Linked_List_Node node){
        head = node;
    }

    //adds to the beginning of a linked list - O(1)
    public void add(Object data){
        if (head == null){
            head = new Linked_List_Node(data);
        }
        else{
            head = new Linked_List_Node(data, head);
        }
    }

    //adds to the end of a linked list - 0(n)
    public void addToEnd(Object data){
        if (head == null){
            head = new Linked_List_Node(data);
        }
        else{
        	Linked_List_Node current = head;
            while (head.getNext() != null){
                current = head.next;
            }
            current.next = new Linked_List_Node(data);
        }
    }

    //adds to linked list to a particular index - O(n)
    public void addToIndex(Object data, int index){
        if (index < 0){
            return;
        }
        int count = 0;
        Linked_List_Node current = head;
        while (count < (index - 1)){
            if (current.next == null){
                return;
            }
            else{
                current = current.next;
            }
            count ++;
        }
        Linked_List_Node tempTail = current.next;
        current.data = new Linked_List_Node(data);
        current.next = tempTail;
    }

    //removes an element from a linked list based on index - O(n)
    public void remove(int index){
        if (head == null){
            return;
        }
        int count = 0;
        Linked_List_Node current = head;
        while (count < (index - 1)){
            if (current.next == null){
                return;
            }
            else if (current.next.next == null){
                return;
            }
            current = current.next;
            count ++;
        }
        Linked_List_Node targetNode = current.next;
        if (targetNode.next == null){
            current.next = null;
        }
        else{
            current.next = targetNode.next;
        }
    }
    
    //finds the first occurrence of an element and returns its index
    //if element is not found returns -1. Order O(n)
    public int find(Object data){
    	if (head == null){
    		return -1;
    	}
    	if (head.data == data){
    		return 0;
    	}
    	return 1 + (new Linked_List(head.next)).find(data);
    }

}
