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
	public int removeFromHead(){
		int info = this.head.info;
		if(this.head==this.tail) this.head = this.tail = null;
		else this.head = this.head.next;
		return info;
	}
	// remove from tail
	public int removeFromTail(){
		int info = this.tail.info;
		if(this.head == this.tail) this.head=this.tail=null;
		else{
			SLNode tmp= this.head;
			for(;tmp.next!=this.tail;tmp=tmp.next);
			this.tail = tmp;
			this.tail.next = null;
		}
		return info;
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
