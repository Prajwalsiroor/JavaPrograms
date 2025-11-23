package doublyLinkedList;
class Node{
	int data;
	Node prev;
	Node next;
	Node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
class DoublyList{
     Node head;
     Node tail;
     int size=0;
     public void insertELement(int data){
    	 Node temp=new Node(data);
    	 if(head==null) head=tail=temp;
    	 else{
    		 tail.next=temp;
    		 temp.prev=tail;
    		 tail=temp;
    	 }
    	 size++;
     }
     public void insertAtHead(int data){
    	 Node temp=new Node(data);
    	 if(head==null) head=tail=temp;
    	 else{
    		 temp.next=head;
    		 head.prev=temp;
    		 head=temp;
    	 }
    	 size++;
     }
     public void insertMiddle(int data,int index){
    	 if(index==0){
    		 insertAtHead(data);
    		 return;
    	 }
    	 else if(index==size){
    		 insertELement(data);
    		 return;
    	 }
    	 else if(index>size){
    		System.out.println("The index is invalid and it is greater than size of the linked list!");
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
     public void displayForward(){
    	 Node temp=head;
    	 while(temp!=null){
    		 System.out.print(temp.data+" ");
    		 temp=temp.next;
    	 }
    	 System.out.println();
     }
     public void displayBackward(){
    	 Node temp=tail;
    	 while(temp!=null){
    		 System.out.print(temp.data+" ");
    		 temp=temp.prev;
    	 }
    	 System.out.println();
     }
     public void size(){
    	 System.out.println(size+" ");
     }
}
public class DoublyLinkedList{
	public static void main(String[] args) {
		DoublyList list=new DoublyList();
		list.insertELement(10);
		list.insertELement(20);
		list.insertELement(30);
		list.insertELement(40);
		list.insertELement(50);
		list.insertELement(60);
		list.displayForward();
		list.displayBackward();
		list.insertAtHead(70);
		list.insertMiddle(450,3);
		list.displayForward();
		list.insertMiddle(750,0);
		list.insertMiddle(480,2);
		list.insertMiddle(630,10);
		list.insertMiddle(560,12);
		list.displayForward();
		list.size();
	}
}