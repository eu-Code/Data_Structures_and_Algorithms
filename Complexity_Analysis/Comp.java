import java.lang.*;
import java.io.*;
public class Comp{
	public void o_of_n(){
		int n = 1000000000;
		int sum =0;
		try{
			FileWriter fileWriter = new FileWriter("o_n.csv");
			fileWriter.write("n,t\n");
			for(int j =1000;j<=n;j*=2){
				long start = System.currentTimeMillis();
				for(int i=0;i<j;i++){
					sum+=i;
				}
				long end = System.currentTimeMillis();
				fileWriter.write(j+","+(end-start)+"\n");
			}
			fileWriter.close();
		
		}
		catch(IOException e){
		
		}
	}

	public static void main(String[] args){
		Comp comp = new Comp();
		comp.o_of_n();
	}
}
