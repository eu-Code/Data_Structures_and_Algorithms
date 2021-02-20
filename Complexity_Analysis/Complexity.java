import java.lang.*;
import java.io.*;
// let us create an object called complexity
public class Complexity{
	public Complexity(){
	}
	public void o_of_n(){
		// initializing sum to 0
		int sum =0;
		FileWriter fileWriter;
		try{
			fileWriter = new FileWriter("test.csv");
			int n = 1000000000;
			for(int j =100;j<n;j=j*10){
				long start = System.currentTimeMillis();
				for(int i=0;i<j;i++){
					sum+=i;
				}
				long end = System.currentTimeMillis();
				fileWriter.write(end-start+","+j+"\n");
			}
			fileWriter.close();
		}
		catch(IOException e){
		
		}
			
	}

	public void o_of_n2(){
		// initializing sum to 0
		int sum =0;
		long start = System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			for(int j=0;j<1000;j++){
				sum+=i;
			}
		}
		long end = System.currentTimeMillis();
		// printing our  sum result
		System.out.println("Sum is "+sum);
		System.out.println(end-start);

	}
	public static void main(String [] args){
		Complexity comp = new Complexity();
		comp.o_of_n();
		comp.o_of_n2();
	}
}
