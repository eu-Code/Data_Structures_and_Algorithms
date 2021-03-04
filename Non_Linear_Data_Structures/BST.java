public class BST{
	public BSTNode root;
	//
	public BST(){
		this.root = null;	
	}

	public void visit(BSTNode p){
		System.out.println(p.key+ " ");
	}

	public BSTNode search(BSTNode p, int el){
		while(p!=null){
			if(el==p.key) return p;
			else if(el<p.key) p = p.left;
			else p=p.right;
		}
		return null;
	}

	public void insert(int el){
		BSTNode p = root;
		BSTNode prev = null;
		while(p!=null){
			prev = p;
			if(p.key<el) p = p.right;
			else p = p.left;
		}
		if (this.root == null) root = new BSTNode(el);
		else if (prev.key<el) prev.right = new BSTNode(el);
		else prev.left = new BSTNode(el);
	}

	public void preorder(BSTNode p){
		if(p!=null){
			this.visit(p);
			preorder(p.left);
			preorder(p.right);
		}
	}

	public void inorder(BSTNode p){
		if(p!=null){
			inorder(p.left);
			this.visit(p);
			inorder(p.right);
		}
	}

	public void postorder(BSTNode p){
		if(p!=null){
			postorder(p.left);
			postorder(p.right);
			this.visit(p);
		}
	}
	public void  breadthFirst(){
		BSTNode p = this.root;
		LLQueue queue = new LLQueue();
		if(p!=null){
			queue.enqueue(p);
			while(!queue.isEmpty()){
				p = (BSTNode)queue.dequeue();
				this.visit(p);
				if(p.left!=null) queue.enqueue(p.left);
				if (p.right!=null) queue.enqueue(p.right);
			}
		}
	}
}
