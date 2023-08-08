package datastructures.linkedlist;

public class LinkedList {

	// CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
	//                                                          //
	//                                                          //
	//                                                          //
	//                                                          //
	//////////////////////////////////////////////////////////////
	
	private Node head;
	private Node tail;
	private int length;
	
	class Node{
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
		}
	}
	
	LinkedList(int value){
		head = new Node(value);
		tail = head;
		length++;
	}
	
	
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    
    public void append(int value) {
    	
    	if(length == 0) {
    		head = new Node(value);
    		tail = head;
    	}
    	else {
    	tail.next = new Node(value);
    	
    	tail = tail.next;
    	}
    	
    	length++;
    	
    }
    
    public void makeEmpty() {
    	head = null;
    	tail = null;
    	length = 0;
    }

}