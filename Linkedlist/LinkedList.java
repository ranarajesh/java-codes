package Linkedlist;

import org.w3c.dom.Node;

public class LinkedList<T> {
    public SinglyNode<T> head;
    public SinglyNode<T> tail;
    
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insertNodeAtTail(T data){
        var node = new SinglyNode<>(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        
    }
    public void insertNodeAtHead(T data){
        var node = new SinglyNode<>(data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
        }else{
            node.next = this.head;
            this.head = node;
        }
    }

    public void printList(){
        var temp = this.head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" → ");
            }
        }
        System.out.print(" → null ");

    }

    public int countNodes() {
    var temp = this.head;
    int i = 0;
        while(temp != null) {
        i++;
        temp = temp.next;
        }
    return i;  
    }  

}
