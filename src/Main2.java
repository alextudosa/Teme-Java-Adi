import java.util.Scanner;

public class Main2 {
	public static void main(String[] args){
		int a[]=new int[]{1,2,3,4,1,6,7,8,9};
		int b[][]=new int[][]{
			{2,1,3},
			{4,5,2},
			{2,5,7},
			{2,4,6}
		};
		int row = b.length;
		int col = b[0].length;
		Scanner in=new Scanner(System.in);
		

		System.out.println("Tell me from which position(0 to " + (a.length-1) + ") you want to read the value from array: ");
		int mySearchArray=in.nextInt();
		
		for(int i = 0;i<a.length;i++){
			if(i==mySearchArray){
			System.out.println("The value from position " + mySearchArray + " is: " + a[i]);
			}
		}
		
		System.out.println("Tell me from which row(0 to " + (b.length-1) + ") you want to read the value from matrix: ");
		int mySearchRow=in.nextInt();
		
		System.out.println("Tell me from which column(0 to " + (b[0].length-1) + ") you want to read the value from matrix: ");
		int mySearchCol=in.nextInt();
		
		 for(int j=0; j<row; j++){
			 for(int k=0; k<col; k++){
				 if(j==mySearchRow && k==mySearchCol){
					 System.out.println("The value is: " +b[j][k]);
				 }
			 }
		 }
	}
}
