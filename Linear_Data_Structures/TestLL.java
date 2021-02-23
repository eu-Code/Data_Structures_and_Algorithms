public class TestLL{
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		//System.out.println(linkedList.isEmpty());
		linkedList.addToTail(1);
		linkedList.addToHead(4);
		//linkedList.printList();
		System.out.println(linkedList.isEmpty());
		//linkedList.printList();
		linkedList.addToTail(3);
		linkedList.addToTail(5);
		linkedList.addToHead(7);
		linkedList.printList();
	}
}
