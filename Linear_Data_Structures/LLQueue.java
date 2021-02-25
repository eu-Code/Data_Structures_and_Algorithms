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
	public void enqueue(int el){
		this.linkedList.addToTail(el);
	}
	// dequeue 
	public int dequeue(){
		if(!this.isEmpty()) return this.linkedList.removeFromHead();
		else return -1;
	}
	//
	public void printQueue(){
		this.linkedList.printList();
	}




}
