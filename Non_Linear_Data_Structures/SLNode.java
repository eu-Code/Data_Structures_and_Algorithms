public class SLNode{
	// define SL Attributes here
	public BSTNode info;
	public SLNode next;
	//
	public SLNode(BSTNode info){
		this.info = info;
		this.next = null;
	}
	//
	public SLNode(BSTNode info, SLNode next){
		this.info = info;
		this.next = next;
	}

}
