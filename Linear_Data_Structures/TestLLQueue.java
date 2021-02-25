public class TestLLQueue{
	public static void main(String[] args){
		LLQueue llQueue = new LLQueue();
		llQueue.enqueue(3);
		llQueue.enqueue(4);
		llQueue.printQueue();
		System.out.println("After "+llQueue.dequeue()+" dequeued");
		llQueue.printQueue();
	}
}
