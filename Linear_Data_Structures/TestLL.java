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
		System.out.println("Before deleting the node");
		linkedList.printList();
		System.out.println("Deleted node contains info of "+linkedList.removeFromHead());
		System.out.println("After deleting the head");
		linkedList.printList();
		System.out.println("Deleted node contains info of "+linkedList.removeFromTail());
		System.out.println("After deleting the tail");
		linkedList.printList();
		System.out.println(linkedList.search(5));
		System.out.println(linkedList.search(3));
		System.out.println("Deleed node contains info of "+linkedList.remove(1));
		linkedList.printList();
	}
}
