package praticeProblems;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
class SinglyLinkedList{
	private Node head=null;
	private Node tail=null;
	private int size=0;
	public void insertAtHead(int data){
		Node temp=new Node(data);
		if(head==null) head=tail=temp;
		else{
			 temp.next=head;
			 head=temp;
		}
		size++;
	}
	public void insertAtTail(int data){
		Node temp=new Node(data);
		if(head==null) head=tail=temp;
		else{
			 tail.next=temp;
			 tail=temp;
		}
		size++;
	}
	public void insertAtMiddle(int data,int index){
		if(index==0){
			insertAtHead(data);
			return;
		}
		else if(index==size){
			insertAtTail(data);
			return;
		}
		else if(index>size){
			System.out.print("The index is greater than size of linked list!");
			return;
		}
		Node temp=new Node(data);
		if(head==null) head=tail=temp;
		Node pointer=head;
		for(int i=1;i<index;i++){
			pointer=pointer.next;
		}
		temp.next=pointer.next;
	    pointer.next=temp;
	    size++;
	}
	public void display(){
	 Node temp=head;
	 if(head==null){
		System.out.print("The Linked list is Empty!");
		return;
	 }
	 while(temp!=null){
		 System.out.print(temp.data+" ");
	 }
	 System.out.println();
	}
}
public class LinkedList{
	public static void main(String[] args){
		SinglyLinkedList list=new SinglyLinkedList();
		list.insertAtTail(10);
		list.insertAtHead(20);
		list.display();
	}

}
