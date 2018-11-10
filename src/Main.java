import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int numberOfApparitionsOfInt=0;
		int numberOfApparitionsOfString=0;
		Scanner in=new Scanner(System.in);
		int a[]=new int[]{2,3,4,5,3,2,5,2,7,8,9};
		String b[]=new String[]{"a","b","a","a","a","b","k","c","d"};
		
		System.out.println("Insert the value type int which you want to search for: ");
		int mySearchInt=in.nextInt();
		
		for(int i=0; i<a.length; i++){
			if(a[i]==mySearchInt){
				numberOfApparitionsOfInt+=1;
			}
		}
		System.out.println("The value " + mySearchInt + " appears " + numberOfApparitionsOfInt + " time/s!");
		
		
		System.out.println("Insert the value type String which you want to search for: ");
		String mySearchString=in.next();
		
		for(int i=0; i<b.length; i++){
			if(b[i].equals(mySearchString)){
				numberOfApparitionsOfString+=1;
			}
		}
		System.out.println("The value " + mySearchString + " appears " + numberOfApparitionsOfString + " time/s!");
		
		
	}
}
