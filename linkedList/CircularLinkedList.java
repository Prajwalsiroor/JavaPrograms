package linkedList;
class CircularList{
	private Node head;
	private Node tail;
	public void insertElementList(int data){
		Node temp=new Node(data);
		if(head==null) {
			head=tail=temp;
		}
		else{
			tail.next=temp;
			tail=temp;
			tail.next=head;
			}
	}
	public void display(){
	   Node temp=head;
	   do{
		   System.out.print(temp.data+" ");
		   temp=temp.next;
	    }
	   while(temp!=head);
	  System.out.println();
	}
}
public class CircularLinkedList{
   public static void main(String[] args){
   CircularList list=new CircularList();
   list.insertElementList(10);
//   list.insertElementList(20);
//   list.insertElementList(30);
//   list.insertElementList(40);
//   list.insertElementList(50);
//   list.insertElementList(80);
//   list.insertElementList(70);
//   list.insertElementList(30);
//   list.insertElementList(90);
//   list.insertElementList(40);
   list.display();
  }
}
