package LinkedList;


public class InsertionInLinkedList {
	Node head = null;
	
	class Node {
		int data;
		Node next;
		
		Node(int val){
			this.data = val;
			this.next = null;
		}
	}
	
	public void insertAtHead(int val) {
		Node n = new Node(val);
		if(head == null) {
			head = n;
			return;
		}
		
		n.next = head;
		head = n;
	}
	
	public void insertAtTail(int val) {
		
		if(head == null) {
			insertAtHead(val);
			return;
		}
		
		Node n = new Node(val);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = n;
	}
	
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		InsertionInLinkedList il = new InsertionInLinkedList();
		
		il.insertAtHead(1);
		il.insertAtTail(0);
		il.insertAtTail(4);
		il.display();
		
	}

}
