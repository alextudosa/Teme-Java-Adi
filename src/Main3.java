import java.util.Scanner;

public class Main3 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("How many rows do you want?");
		int row = in.nextInt();
		System.out.println("How many columns do you want?");
		int col = in.nextInt();
		int a[][]=new int[row][col];

		
		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j] + " ");
	        }
	        System.out.println("");
		}
	}
}
