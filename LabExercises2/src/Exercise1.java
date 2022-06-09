import java.util.Scanner; 
public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Input a starting value: ");
		int start = scan.nextInt();
		System.out.print("Input an ending value: ");
		int end = scan.nextInt();
		for(int i = start; i <= end; i++)System.out.print( i + " ");
		
	}
}

/*Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.

Input the start: 3 Input the End: 9

Expected Output :

3 4 5 6 7 8 9*/ 