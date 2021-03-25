public class BubbleSort{
	public static void main(String[] args){
		System.out.println("Buble Sort Demo");
		int [] testArray = new int[] {10,7,9,8,6};
		System.out.println("Before Sorting");
		for(int i=0;i<5;i++){
			System.out.println(testArray[i]);
		}
		for(int i=0;i<5;i++){
			for(int j=i;j<5;j++){
				if(testArray[j]<testArray[i]){
					int temp = testArray[i];
					testArray[i] = testArray[j];
					testArray[j] = temp;
				}
			}
		}
		System.out.println("After bubble sort applied");
		for(int i=0;i<5;i++){
			System.out.println(testArray[i]);
		}
	}
}
