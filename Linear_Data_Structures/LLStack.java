public class LLStack{
	//
	private LinkedList linkedList;
	public LLStack(){
		this.linkedList = new LinkedList();		
	}
	// is empty
	public boolean isEmpty(){
		return this.linkedList.isEmpty();
	}
	// pop
	public int pop(){
		if(!this.isEmpty()) return this.linkedList.removeFromTail();
		else return -1;
	}
	//
	public void push(int el){
		this.linkedList.addToTail(el);
	}
	public void printStack(){
		this.linkedList.printList();
	}
}
