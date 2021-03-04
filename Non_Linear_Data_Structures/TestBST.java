public class TestBST{
	public static void main(String [] args){
		BST bst = new BST();
		bst.insert(1);
		bst.insert(2);
		BSTNode root = new BSTNode(1);
		BSTNode bstNode = new BSTNode(2);
		System.out.println(bstNode.key);
		System.out.println(bst.search(bst.root,2).key);
	}
}
