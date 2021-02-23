public class LinkedList{
	private SLNode head; // head node
	private SLNode tail; // tail node
	public LinkedList(){
		this.head = null;
		this.tail = null;
	}
	// add to head
	public void  addToHead(int el){
		// write your implementation here
		SLNode node = new SLNode(el,this.head);
		this.head = node;
		if(this.tail==null) this.tail = this.head;
	}
	// add to tail
	public void addToTail(int el){
		// write your implementation here
		if(!isEmpty()){	
			this.tail.next = new SLNode(el,null);
			this.tail = this.tail.next;
		}
		else this.head=this.tail= new SLNode(el,null);
	}
	// remove from head
	public void removeFromHead(){
		// write your implementation here
	}
	// remove from tail
	public void removeFromTail(){
		// write your implementation here
	}
	// remove from anywhere
	public void remove(SLNode node){
		// write your implementation here
	}
	// search node
	public void search(SLNode node){
		// write your implementation here
	}
	//print list
	public void printList(){
		// write your implementation here
		for(SLNode temp = this.head;temp!=null;temp=temp.next)
			System.out.println(temp.info);
	}
	//
	public boolean isEmpty(){
		return this.head==null;
	}
	
	
}
