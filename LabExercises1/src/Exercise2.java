import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input the cents: ");
		float dollars = scan.nextInt() / 100f;
		int cents = (int)(dollars *100)%100;
		System.out.println("The value is " + (int)dollars+ " dollars and "+ cents +" cents.");
		
	}
		
}

