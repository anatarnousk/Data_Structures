/*
 *  Java Implementation of Linked List Data Structure
 *  @author: Anastasiya Tarnouskaya
 *
 */


/* Linked list class */

public class Linked_List{
    private Node head;

    //constructor for an empty Linked List
    public Linked_List(){
        head = null;
    }

    //constructor for non-empty Linked List
    public Linked_List(Node node){
        head = node;
    }

    //adds to the beginning of a linked list - O(1)
    public void add(Object data){
        if (head == null){
            head = new Node(data);
        }
        else{
            head = new Node(data, head);
        }
    }

    //adds to the end of a linked list - 0(n)
    public void addToEnd(Object data){
        if (head == null){
            head = new Node(data);
        }
        else{
            Node current = head;
            while (head.getNext() != null){
                current = head.next;
            }
            current.next = new Node(data);
        }
    }

    //adds to linked list to a particular index - O(n)
    public void addToIndex(Object data, int index){
        if (index < 0){
            return;
        }
        int count = 0;
        Node current = head;
        while (count < (index - 1)){
            if (current.next == null){
                return;
            }
            else{
                current = current.next;
            }
            count ++;
        }
        Node tempTail = current.next;
        current.data = new Node(data);
        current.next = tempTail;
    }

    //removes an element from a linked list based on index - O(n)
    public void remove(int index){
        if (head == null){
            return;
        }
        int count = 0;
        Node current = head;
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
        Node targetNode = current.next;
        if (targetNode.next == null){
            current.next = null;
        }
        else{
            current.next = targetNode.next;
        }
    }

}
