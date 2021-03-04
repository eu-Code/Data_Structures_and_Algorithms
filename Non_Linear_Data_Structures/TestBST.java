public class TestBST{
	public static void main(String [] args){
		BST bst = new BST();
		bst.insert(3);
		bst.insert(2);
		bst.insert(5);
		System.out.println("Searching for a specific key");
		System.out.println(bst.search(bst.root,2).key);
		//pre order traversing
		System.out.println("Preorder");
		bst.preorder(bst.root);
		System.out.println("Inorder");
		bst.inorder(bst.root);
		System.out.println("Postorder");
		bst.postorder(bst.root);
		System.out.println("Breadth First");
		bst.breadthFirst();
	}
}
