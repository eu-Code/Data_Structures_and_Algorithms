public class LLQueue{
	//
	private LinkedList linkedList;
	public LLQueue(){
		this.linkedList = new LinkedList();
	}
	// is empty
	public boolean isEmpty(){
		return this.linkedList.isEmpty();
	}
	// enqueue
	public void enqueue(BSTNode el){
		this.linkedList.addToTail(el);
	}
	// dequeue 
	public BSTNode dequeue(){
		if(!this.isEmpty()) return this.linkedList.removeFromHead();
		else return null;
	}
	//
	public void printQueue(){
		this.linkedList.printList();
	}




}
