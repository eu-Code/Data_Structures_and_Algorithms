public class InsertionSort{
	public static void main(String [] args){
		System.out.println("Buble Sort Demo");
		int [] testArray = new int[] {10,7,9,8,6};
		System.out.println("Unsorted");
		for(int i=0;i<5;i++){
			System.out.println(testArray[i]);
		}
		for (int i = 1; i < 5; ++i) {
		    int key = testArray[i];
		    int j = i - 1;
		    while (j >= 0 && testArray[j] > key) {
		        testArray[j + 1] = testArray[j];
		        j = j - 1;
		    }
		    testArray[j + 1] = key;
        	}
		System.out.println("Sorted");
		for(int i=0;i<5;i++){
			System.out.println(testArray[i]);
		}
	}
}
