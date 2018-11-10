import java.util.Scanner;

public class Main4 {
	public static void main(String[] args){
		int a[][]=new int[][]{
			{2,1,3},
			{4,5,2},
			{2,5,7}
		};
		int b[][]=new int[][]{
			{2,2,3},
			{4,6,3},
			{2,5,6}
		};
		int row = b.length;
		int col = b[0].length;
		int sum[][] = new int[row][col];
		int scalarMatrix[][] = new int[row][col];
		int multiplicationMatrix[][] = new int[row][col];
		Scanner in = new Scanner(System.in);
		System.out.println("Insert scalar value: ");
		int myscalar = in.nextInt();
		
		
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				sum[i][j]=a[i][j] + b[i][j];
				System.out.print(sum[i][j] + " ");
	        }
	        System.out.println("");
		}
			System.out.println("");
		
		for(int k = 0; k<row; k++){
			for(int m = 0; m<col; m++){
				scalarMatrix[k][m] = a[k][m] * myscalar;
				multiplicationMatrix[k][m]=0;
				System.out.print(scalarMatrix[k][m] + " ");
	        }
	        System.out.println("");
		}
			System.out.println("");
			
			
		
		for(int n = 0; n<row; n++){
			for(int p = 0; p<col; p++){
				multiplicationMatrix[n][p] += a[n][p] * b[p][n];
				System.out.print(multiplicationMatrix[n][p] + " ");
	        }
	        System.out.println("");
		}
		
		
	}
}
