import java.util.Scanner;

public class Main5 {
	public static void main(String[] args){
		int rand=(int)(Math.random()*15);
		int a[] = new int[rand];
		Scanner in = new Scanner(System.in);
		System.out.println("Insert the value wanted(range 0 to 15): ");
		int searchVal = in.nextInt();
		
		
		for(int i=0; i<a.length; i++){
			a[i]=(int)(Math.random()*15);
			System.out.print(a[i] + " ");
			
		}
		System.out.println();
		
		for(int j=0; j<a.length; j++){
//			switch(a[j]){
//				case searchVal: 
//					System.out.println("I've found the value: " + searchVal);
//					break;
//			}
			System.out.print(a[j] + " ");
			
			if(a[j]==searchVal){
				System.out.println();
				System.out.println("I've found the value: " + searchVal);
				break;
			}
		}
	}
}
