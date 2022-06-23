import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question1 {	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Random ram = new Random();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			nums.add(ram.nextInt(50)+1);
			System.out.println(nums.get(i));
		}
		
		
		System.out.println("Enter an integer: ");
		int search = scan.nextInt();
		
		
		for (int n = 0; n < nums.size(); n++) {
			if (nums.get(n) == search) {
				System.out.println("Number is in the list");
				break;
			}
			else if(n == nums.size()-1) {
				System.out.println("Number is not in the list ");				
			}
		}
		
	}
}
