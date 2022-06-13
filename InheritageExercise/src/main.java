
import animalKingdom.child.Crocodile;
import animalKingdom.child.Eagle;
import animalKingdom.child.Eel;

public class main {
	
	public static void main(String[] args) {
		Crocodile croc = new Crocodile(10.0f, 300.1f, "Reptile", "Cold", "Dry skin", "Backbone", "Hard-shelled eggs");
		System.out.println(croc.ShowInfo());
		
		Eel eel = new Eel(2.0f, 8.0f, "Fish", "Cold", "Water", true, "Release electric charges"); 
		System.out.println("\n" + eel.ShowInfo());
		
		Eagle eagle = new Eagle(.05f, 6.0f, "Bird", "Hot", true, true);
		System.out.println("\n" + eagle.ShowInfo());
	}
}
