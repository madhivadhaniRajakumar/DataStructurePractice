package Practice;

public class SinglyLinkedList {
	Node head;
	class Node{
		int val;
		Node next;
		
		Node(int val){
			this.val = val;
			next = null;
		}
		
	}
	
	public SinglyLinkedList() {
		head = null;
	}
	public void insertAtBegin(int val) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head = newNode;
		}
		else {
			newNode.next=head;
			head = newNode;
		}
		
	}
	public void insertAtPosition(int val,int pos) {
		Node newNode = new Node(val);
		Node temp = head;
		
		if(pos==1) {
			insertAtBegin(val);
			return;
		}
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next=newNode;
		
	}
	public void removeAtBegin() {
		head=head.next;
	}
	public void removePosition(int pos) { 
		Node temp = head;
		Node prev = null;
		if(pos==1) {
			removeAtBegin();
			return;
		}
		for(int i=1;i<pos;i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		
	}
	
	public void removeElement(int val) {
		Node temp = head;
		Node ptr = head;
		int pos=0;
		while(ptr!=null) {
			if(ptr.val==val) {
				break;
			}
			pos++;
			ptr=ptr.next;
		}
		for(int i=1;i<pos-1;i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public void reverseSinglyLinkedList() {
		Node temp=null;
		Node temp1=null;
		while(head!=null) {
			temp = head.next;
			head.next = temp1;
			temp1 = head;
			head= temp;
		}
	        head=temp1;
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+ " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		SinglyLinkedList l1 = new SinglyLinkedList();
		l1.insertAtBegin(5);
		l1.insertAtBegin(6);
		l1.insertAtBegin(8);
		l1.insertAtPosition(7, 3);
		l1.display();
		l1.removePosition(2);
		l1.display();
		l1.display();

	}

}
