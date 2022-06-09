import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("How many integers will be added? ");
		int quant = scan.nextInt();
		int sum = 0;
		for(int i = 0 ; i < quant; i++ ) {
			System.out.print("Enter an integer:  ");
			int num = scan.nextInt();
			sum += num;
		}System.out.print("The sum is " + sum);
	}
}
