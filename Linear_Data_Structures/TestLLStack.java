public class TestLLStack{
	public static void main(String[] args){
		LLStack llStack = new LLStack();
		llStack.push(1);
		llStack.push(2);
		llStack.printStack();
		System.out.println("After poping "+llStack.pop());
		llStack.printStack();
	}
}
