public class BSTNode{
	public int key;
	public BSTNode left, right;
	// first const 
	public BSTNode(){
		this.left = this.right = null;
	}
	// second const
	public BSTNode(int el){
		this.key = el;
		this.left = null;
		this.right = null;
	}
	// third const
	public BSTNode(int el,BSTNode left, BSTNode right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
}
