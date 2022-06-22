import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class main {
	
	public static void main(String[] args) {
		
		System.out.println("Please type the first number");
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		calc.setNum1(scan.nextDouble());
		
		System.out.println("Choose an operation: \n> Type + for  addition \n> Type - for  subtraction \n> Type * for  multiplication \n> Type / for  division");
		
		char op = scan.next().charAt(0);
		System.out.println("Please type the second number");
		
		calc.setNum2(scan.nextDouble());
		if(calc.getNum2() == 0 && op == '/') System.out.println("Cannot divide by zero");
		else switch (op) {
			case '+': {
				System.out.println(calc.getNum1() + " " + op + " " + calc.getNum2() + " = " + calc.add());
				break;
			}
			
			case '-':{
				System.out.println(calc.getNum1() + " " + op + " " + calc.getNum2() + " = " + calc.subtract());
				break;
			}
			
			case '*':{
				System.out.println(calc.getNum1() + " " + op + " " + calc.getNum2() + " = " + calc.multiply());
				break;
			}
			case '/':{
				System.out.println(calc.getNum1() + " " + op + " " + calc.getNum2() + " = " + calc.divide());
				break;
			}
		}
		
		System.out.println("Do you want to  continue or quit?");
		String word = scan.next();
		if(word.equalsIgnoreCase("Bye"))System.out.println("Bye!");
		else main(args);
	}
}
