import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		char answer;
		boolean gameFinished = false;	
		ArrayList<Integer> sortedQuestions = new ArrayList<>();
		int questionThreshold = 21;
		
		
		System.out.println("Hello, please type your name: ");
		String name = sc.next();
		Trivia game = new Trivia(name, 3,0,0);		
		
		
		if(game.Menu()) {
			
			do {						
				int question = r.nextInt(1,questionThreshold);
				do {
				question = r.nextInt(1,questionThreshold);
				} while (sortedQuestions.contains(question));
			
			
			answer = game.Question(question);
			sortedQuestions.add(question);
			game.answer(answer);
			
			Thread.sleep(3500);
			clrscr();
			if(game.score == questionThreshold-1 || game.getQuestionsAsked() == questionThreshold-1 
					||game.getAttempts()==0 )gameFinished = true;	
			}while (!gameFinished);
			game.endGame();
		}
		
		
	}
	
	public static void clrscr(){
		//Clears Screen in java
		for( int i = 0; i < 3 ; i++) System.out.println("\n");
	}
	
	
}

			
	

