public class Complexity{
	public Complexity(){
	}
	public void o_of_n(){
		// initializing our data
		int[] data = new int[1000];
		// initializing sum to 0
		int sum =0;
		for(int i=0;i<1000;i++){
			sum+=i;
		}
		System.out.println(sum);
			
	}

	public void of_of_n2(){
		// initializing our data
		int[] data = new int[1000];
		// initializing sum to 0
		int sum =0;
		for(int i=0;i<1000;i++){
			for(int j=0;j<1000;j++){
				sum+=i;
			}
		}
		// printing our  sum result
		System.out.println(sum);
	}
	public static void main(String [] args){
		Complexity comp = new Complexity();
		comp.o_of_n();
	}
}
