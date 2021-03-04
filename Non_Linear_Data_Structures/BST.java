public class BST(){
	private BSTNode root;
	//
	public BST(){
		this.root = null;	
	}

	public void visit(BSTNode p){
		System.out.println(p.key+ " ");
	}

	public BSTNOde search(BSTNode p, int el){
		while(p!=null){
			if(el==p.key) return p;
			else if(el<p.key) p = p.left;
			else p=p.right;
		}
		return null;
	}

	public void insert(el){
		BSTNode p = root;
		BSTNode prev = null;
		while(p!=null){
			prev = p;
			if(p.key<el) p = p.right;
			else p = p.left;
		}
		if (this.root = = null) root = new BSTNode(el);
		else if (prev.key<el) prev.right = new BSTNode(el);
		else prev.left = new BSTNode(el);
	}
}
