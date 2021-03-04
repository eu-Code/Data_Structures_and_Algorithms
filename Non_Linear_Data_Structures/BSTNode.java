public class BSTNode{
	private int key;
	private BSTNode left, right;
	// first const 
	public BSTNode(){
		this.left = this.right = null;
	}
	// second const
	public BSTNode(int el){
		this(el,null,null);
	}
	// third const
	public BSTNode(int el,BSTNode left, BSTNode right){
		this.key = key;
		this.left = left;
		this.right = right;
	}
}
