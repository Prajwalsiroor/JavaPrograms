package linkedList;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
class SinglyLinkedList{
	private Node head=null;
	private Node tail=null;
	private int size=0;
	public void insert(int data){
		Node temp=new Node(data);
		if(head==null) head=tail=temp;
		else{
			tail.next=temp;
			tail=temp;
		}
		size++;
	}
	public void insertAtTail(int data){
	 Node temp=new Node(data);
	 if(head==null){
		 head=tail=temp;
	 }
	 else{
		 tail.next=temp;
		 tail=temp;
	 }
	 size++;
	}
	public void insertHead(int data){
	Node temp=new Node(data);
	if(head==null){
		head=tail=temp;
	}
	else{
		temp.next=head;
		head=temp;
	 }
	size++;
	}
	void size(){
		System.out.println(size);
	}
	public void display(){
	Node temp=head;
	while(temp!=null){
	     System.out.print(temp.data+" ");
	     temp=temp.next;
	 }
	 System.out.println();
	}
	public void search(int key){
	 Node temp=head;
	 int index=0;
	 boolean flag=false;
	 while(temp!=null){
		 if(temp.data==key){
			 flag=true;
		 }
		 temp=temp.next;
		 index++;
	  }
	 if(flag==true){
		 System.out.println("The key found at index:"+index);
	 }
	 else{
		 System.out.println("The Key is not found.");
	 }
	}
}
public class ImplementingSinglyLinkedList{
	public static void main(String[] args){
    SinglyLinkedList list=new SinglyLinkedList();
    System.out.println("The Linked List is:");
	    list.insert(10);
	    list.insert(20);
	    list.insert(30);
	    list.insert(40);
	    list.insert(50);
	    list.insert(60);
	    list.search(40);
	    list.display();
	    list.insertAtTail(10);
	    list.insertAtTail(20);
	    list.insertAtTail(30);
	    list.insertAtTail(40);
	    list.size();
        list.insertHead(710);
        list.insertHead(20);
        list.insertHead(30);
        list.insertHead(40);
        list.insertHead(50);
        list.insertHead(560);
        list.search(40);
	    list.display();
	}
}