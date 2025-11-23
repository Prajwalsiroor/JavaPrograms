package linkedList;
class SinglyLList{
	private Node head=null;
	private Node tail=null;
	void insertMiddle(int index,int data){
	Node temp=new Node(data);
	Node pointer=head;
	int i=0;
	while(i<index-1){
		    pointer=pointer.next;
		    i++;
	   }
    	temp.next=pointer.next;
		pointer.next=temp;

	}
	public void insert(int data){
		Node temp=new Node(data);
		if(head==null) head=tail=temp;
		else{
			tail.next=temp;
			tail=temp;
		}
	}
	public void display(){
	Node temp=head;
	while(temp!=null){
	     System.out.print(temp.data+" ");
	     temp=temp.next;
	 }
	System.out.println();
	}
}
public class InsertAtMiddleOfLinkedList{
	public static void main(String[] args) {
    SinglyLList list=new SinglyLList();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insertMiddle(2,100);
    list.display();
	}
}