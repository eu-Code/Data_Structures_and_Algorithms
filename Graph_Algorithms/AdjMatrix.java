/**
 * Graph representation using adjacency matrix.
 */
import java.util.Scanner;
public class AdjMatrix{
        //
        private int numNodes;
        private int [][] matrix;
	private Scanner scanner;
        //
        public AdjMatrix(int numNodes){
                this.numNodes = numNodes;
                this.matrix = new int[this.numNodes][this.numNodes];
		this.scanner = new Scanner(System.in);
        }
        //
	public void initGraph(){
		for(int i=0;i<this.numNodes;i++){
			for(int j=0;j<this.numNodes;j++){
				System.out.println("Enter the cost between Node"+(i+1)+" and Node"+(j+1));
				this.matrix[i][j] = this.scanner.nextInt();
			}
		}
	}
	//
	public void dispGraph(){
		for(int i=0;i<this.numNodes;i++){
			for(int j=0;j<this.numNodes;j++){
				System.out.print(this.matrix[i][j]);
			}
			System.out.println("");
		}
	}

	public static void  main(String[] args){
		AdjMatrix adjMatrix = new AdjMatrix(4);
		adjMatrix.dispGraph();
		adjMatrix.initGraph();
		adjMatrix.dispGraph();
	}
}

