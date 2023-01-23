package Practice;

import Practice.SinglyLinkedList.Node;

public class DoublyLinkedList {
	Node head;
	Node tail;
	class Node {
		int val;
		Node next;
		Node prev;
		
		Node(int val){
			this.val = val;
			next = null;
			prev=null;
		}
		
	}

	public DoublyLinkedList() {
		head=null;
		tail=null;
	}
	
	public void insertBegin(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head.prev = newNode;
			head=newNode;
			
		}
	}
	
	public void insertByPosition(int val,int pos) {
		Node newNode = new Node(val);
		Node temp = head;
		if(pos==0) {
			insertBegin(val);
			return;
		}
		for(int i=1;i<pos;i++) {
			temp = temp.next;
		}
		newNode.prev = temp;
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next= newNode;
		
	}
	public void insertAtEnd(int val) {
		Node newNode = new Node(val);
		tail.next=newNode;
		newNode.prev=tail;
		tail = newNode;
		
		
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	public void displayReverse() {
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.val+ " ");
			temp = temp.prev;
		}
		 
		System.out.println();
		
	}
	public static void main(String[] args) {
		DoublyLinkedList l1 = new DoublyLinkedList();
		l1.insertBegin(2);
		l1.insertBegin(4);
		l1.insertBegin(5);
		l1.insertBegin(7);
		l1.display();
		l1.insertByPosition(3, 2);
		l1.display();
		l1.insertAtEnd(9);
		l1.display();
		
		//l1.displayReverse();

	}

}
