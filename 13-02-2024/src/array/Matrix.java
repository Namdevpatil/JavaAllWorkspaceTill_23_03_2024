package array;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1,0,0},{0,1,0}};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length+1;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
				
			System.out.println("\n\n");
				
		}

	}

}
