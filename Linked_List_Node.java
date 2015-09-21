/*
 *  Java Implementation of Linked List Data Structure
 *  @author: Anastasiya Tarnouskaya
 *
 */

/* Node class */

public class Linked_List_Node{
    Object data;
    Linked_List_Node next;

    //constructor for a node with no next value
    public Linked_List_Node(Object data){
        this.data = data;
        next = null;
    }

    //constructor for node with specified next value
    public Linked_List_Node(Object data, Linked_List_Node next){
        this.data = data;
        this.next = next;
    }

    public Linked_List_Node getNext(){
        return next;
    }
}
