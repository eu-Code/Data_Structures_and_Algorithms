public class SelectionSort{
	public static void main(String [] args){
		//
		System.out.println("Demo on selection sort");
		int [] testArray = new int[] {10,7,9,8,6};
		System.out.println("Unsorted");
		for(int i=0;i<5;i++){
			System.out.println(testArray[i]);
		}
		/*Selection sort*/
		for(int j=0;j<5;j++){
			int index = j;
			for(int i=j+1;i<5;i++){
				if(testArray[i]<testArray[j]) index = i;
			}
			if(index!=j){
				int temp = testArray[j];
				testArray[j] = testArray[index];
				testArray[index]=temp;
			}
		}
		System.out.println("Sorted");
		for(int j=0;j<5;j++){
			System.out.println(testArray[j]);
		}
	}
}
