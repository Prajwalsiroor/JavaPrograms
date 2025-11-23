package linkedList;
class Insertion{
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
		if(index==size){
			insertAtTail(data);
			return;
		}
		if(index>size){
			System.out.println("Exception!! And index is greater than size.");
			return;
		}
		Node temp=new Node(data);
		Node pointer=head;
		if(head==null) head=tail=temp;
		for(int i=1;i<index;i++){
			pointer=pointer.next;
		}
		temp.next=pointer.next;
		pointer.next=temp;
		size++;
	}
	public void display(){
	    Node temp=head;
	    while(temp!=null){
	    	System.out.print(temp.data+" ");
	    	temp=temp.next;
	    }
	    System.out.println();
	}
	public void size(){
		System.out.println("The Size of the LinkedList is:"+size);
	}
}
public class LinkedListInsertion{
	public static void main(String[] args){
    Insertion list=new Insertion();
    list.insertAtTail(10);
    list.insertAtTail(20);
    list.insertAtTail(30);
    list.insertAtTail(40);
    list.insertAtTail(120);
    list.display();
    list.insertAtHead(50);
    list.insertAtHead(60);
    list.insertAtHead(70);
    list.insertAtHead(80);
    list.insertAtHead(110);
    list.display();
    list.insertAtMiddle(130,5);
    list.insertAtMiddle(90,2);
    list.display();
    list.insertAtMiddle(100,8);
    list.insertAtTail(150);
    list.insertAtHead(140);
    list.display();
    list.size();
    list.insertAtMiddle(160,8);
    list.display();
	}
}