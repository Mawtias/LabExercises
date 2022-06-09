import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number:");
		int number = scan.nextInt();
		for (int i = 0; i < 11; i++) {
			System.out.println(number + " x " + i + " = " + number*i);				
		}
		
	}
	
}
