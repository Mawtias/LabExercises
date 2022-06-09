import java.util.Scanner; 

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Input the radius: ");
		int radius = scan.nextInt();
		System.out.println("The radius is: " + radius + "The area is: " + radius * radius * Math.PI);
		
	}
	
}
