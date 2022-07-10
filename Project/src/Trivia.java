import java.util.Scanner;

public class Trivia{
	
	private String username;
	public int score;	
	private int attempts;
	private int questionsAsked;
	

	public Trivia(String username, int attempts, int score, int questionsAsked) {
		this.username = username;
		this.attempts = attempts;
		this.score = score;
		this.questionsAsked = questionsAsked;
	}
	
	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public String getUsername() {
		return username;
	}
	
	public int getQuestionsAsked() {
		return questionsAsked;
	}
	
	public  boolean Menu() {
		Scanner sc = new Scanner(System.in);
		
		
		clrscr();
		System.out.println("Welcome " + getUsername()+ ", to: ");
		System.out.println("===================================");
		System.out.println("         THE BRAZILIAN TRIVIA      ");
		System.out.println("===================================");
		System.out.println("Answer to alternative questions trying to score the most points!");
		System.out.println("You can be wrong up to " + attempts + " times.");
		System.out.println("type START to begin: ");
		if (sc.next().equalsIgnoreCase("start"))return true;
		else {
			validInput("start", null);
			return true;
		}
	}
	


	public  char Question(int num) {
		questionsAsked +=1;
		switch (num) {
		case 1: {
			clrscr();
			System.out.println("In which continent is Brazil locacted?");
			System.out.println("a) Africa");
			System.out.println("b) Americas");
			System.out.println("c) Oceania");
			System.out.println("d) Europe");
			return 'B';
			
		}
		
		case 2: {
			clrscr();
			System.out.println("What is the language spoken in Brazil?");
			System.out.println("a) Spanish");
			System.out.println("b) French");
			System.out.println("c) Portuguese");
			System.out.println("d) Brazilian");			
			return 'C';
			
		}
		
		case 3: {
			clrscr();
			System.out.println("What is the capital of Brazil?");
			System.out.println("a) Rio de Janeiro");
			System.out.println("b) Sao Paulo");
			System.out.println("c) Copacabana");
			System.out.println("d) Brasilia");		
			return 'D';
			
		}
		
		case 4: {
			clrscr();
			System.out.println("How many states are there in Brazil? (including the Federal District)");
			System.out.println("a) 27");
			System.out.println("b) 23");
			System.out.println("c) 26");
			System.out.println("d) 20");
			return 'A';
			
		}
		
		case 5: {
			clrscr();
			System.out.println("What is the population size in Brazil?");
			System.out.println("a) 153 million");
			System.out.println("b) 98 million");
			System.out.println("c) 264 million");
			System.out.println("d) 212 million");
			return 'D';
			
		}
		case 6: {
			clrscr();
			System.out.println("What is the most famous sport in Brazil?");
			System.out.println("a) Volleyball");
			System.out.println("b) Handball");
			System.out.println("c) Soccer");
			System.out.println("d) Hockey");
			return 'C';
			
		}
		case 7: {
			clrscr();
			System.out.println("How old is the brazilian republic? (since the independence)");
			System.out.println("a) 301 y.o.");
			System.out.println("b) 200 y.o.");
			System.out.println("c) 167 y.o.");
			System.out.println("d) 88 y.o.");
			return 'B';
			
		}
		case 8: {
			clrscr();
			System.out.println("When was Brazil found by Portugal?");
			System.out.println("a) 1872");
			System.out.println("b) 1500");
			System.out.println("c) 1378");
			System.out.println("d) 1743");
			return 'B';
			
		}
		case 9: {
			clrscr();
			System.out.println("Brazil week long holiday is known as:");
			System.out.println("a) Tiradentes");
			System.out.println("b) Feijoada");
			System.out.println("c) Carnaval");
			System.out.println("d) Rock in Rio");
			return 'C';
			
		}
		case 10: {
			clrscr();
			System.out.println("______ is a worldwide famous brazilian music genre.");
			System.out.println("a) Bossa Nova");
			System.out.println("b) Baby Metal");
			System.out.println("c) Rap");
			System.out.println("d) Funk");
			return 'A';
			
		}
		
		case 11: {
			clrscr();
			System.out.println("How often do people in Brazil usually shower?");
			System.out.println("a) Four times a week");
			System.out.println("b) Every two days");
			System.out.println("c) Once a week");
			System.out.println("d) Once a day");
			return 'D';
			
		}
		case 12: {
			clrscr();
			System.out.println("What colors are in Brazil's flag?");
			System.out.println("a) White, Green, Yellow and Black");
			System.out.println("b) White, Yellow, Blue and Black");
			System.out.println("c) Blue, Green, Yellow and Black");
			System.out.println("d) White, Green, Yellow and Blue");
			return 'D';			
		}
		case 13: {
			clrscr();
			System.out.println("How many regions does Brazil have?");
			System.out.println("a) 8");
			System.out.println("b) 2");
			System.out.println("c) 5");
			System.out.println("d) 3");
			return 'C';			
		}
		case 14: {
			clrscr();
			System.out.println("Which country colonized Brazil?");
			System.out.println("a) Portugal");
			System.out.println("b) France");
			System.out.println("c) Spain");
			System.out.println("d) Italy");
			return 'A';			
		}
		
		case 15: {
			clrscr();
			System.out.println("Which of the following is a a city in Brazil?");
			System.out.println("a) Berlim");
			System.out.println("b) Fortaleza");
			System.out.println("c) Lagos");
			System.out.println("d) Lisboa");
			return 'B';			
		}
		case 16: {
			clrscr();
			System.out.println("In Brazil there are _____ time zones");
			System.out.println("a) 4");
			System.out.println("b) 3");
			System.out.println("c) 2");
			System.out.println("d) 1");
			return 'A';			
		}
		case 17: {
			clrscr();
			System.out.println("Which of the following is a typical brazilian food?");
			System.out.println("a) Poutine");
			System.out.println("b) Lasagna");
			System.out.println("c) Brigadeiro");
			System.out.println("d) Kimchi");
			return 'C';			
		}
		
		case 18: {
			clrscr();
			System.out.println("Brazil has in its territory one of of the most famous forests in the world. It is the ______");
			System.out.println("a) Ticaracatica forest");
			System.out.println("b) Dark forest");
			System.out.println("c) Taiga forest");
			System.out.println("d) Amazon forest");
			return 'D';			
		}
		
		case 19: {
			clrscr();
			System.out.println("Which of these animals can be found in Brazil?");
			System.out.println("a) Gorilla");
			System.out.println("b) Lion");
			System.out.println("c) Capybara");
			System.out.println("d) Rhino");
			return 'C';			
		}
		case 20: {
			clrscr();
			System.out.println("Which of these famous people is not brazilian?");
			System.out.println("a) Rodrigo Santoro");
			System.out.println("b) Carmen Miranda");
			System.out.println("c) Giselle Bundchen");
			System.out.println("d) Anitta");
			return 'B';			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	
	}
	
	public  boolean answer(char answer) {
	//System.out.println("Please type your asnwer: ");
		Scanner sc = new Scanner(System.in);
		char userAnswer = sc.next().toUpperCase().charAt(0);
		if(userAnswer == answer) {
			System.out.println("Correct! Now let's go to the next question!");
			score +=1;
			return true;
		}
		else if(userAnswer == 'A' || userAnswer == 'B' || userAnswer == 'C' || userAnswer == 'D' ){
			System.out.println("Oh, I'm sorry. The correct answer was: " + answer);
			attempts -=1;
			if(attempts != 0 )System.out.println("You have " + attempts + " more lives. Good luck!");			
			return false;
		}else {
			System.out.println("Invalid input. Please type again: ");
			return answer(answer);
		}
		
		
		
	}
	
	public void endGame() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Congratulations " + getUsername()+ "!" + "\nYou answered " + score + " questions correctly!");
		System.out.println("Would you like to play again? Type YES or NO");
		if(sc.next().equalsIgnoreCase("yes")) {
			App.main(null);
		}
		else {
			clrscr();
			System.out.println("Thank you for playing!");
			System.exit(0);
		}
		
	}
	
	public void validInput(String rightInput, String userInput) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Invalid input. Please type again: ");
			userInput = sc.next();
		
		} while (!userInput.equalsIgnoreCase(rightInput));
	}
	
	public static void clrscr(){
		//Clears Screen in java
		for( int i = 0; i < 5 ; i++) System.out.println("\n");
	}
}
