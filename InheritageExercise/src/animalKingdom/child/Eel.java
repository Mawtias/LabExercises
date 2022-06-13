package animalKingdom.child;
import animalKingdom.child.Fish;

public class Eel extends Fish{

	private String ability;
	
	
	public String getAbility() {
		return ability;
	}


	public Eel(float height, float weight, String animalType, String bloodType, String habitat, boolean hasGills, String ability) {
		super(height, weight, animalType, bloodType, habitat, hasGills);
		this.ability = ability;
	}



	public String ShowInfo() {
		return "Eel: " + "   Type - "+  getAnimalType() +"    Height - " + getHeight() + "    Weight - " + getWeight()  + "    Blood - " + getBloodType()
		+ "    Habitat - " + getHabitat() + "    Gills - " + isHasGills() + "    Ability - " + getAbility();
		
	}
}
