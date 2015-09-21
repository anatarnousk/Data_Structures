/*
 *  Java Implementation of Linked List Data Structure
 *  @author: Anastasiya Tarnouskaya
 *
 */

/* Node class */

public class Node{
    Object data;
    Node next;

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

    public Node getNext(){
        return next;
    }
}
