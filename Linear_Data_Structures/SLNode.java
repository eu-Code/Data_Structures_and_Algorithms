public class SLNode{
	// define SL Attributes here
	public int info;
	public SLNode next;
	//
	public SLNode(int info){
		this.info = info;
		this.next = null;
	}
	//
	public SLNode(int info, SLNode next){
		this.info = info;
		this.next = next;
	}

}
