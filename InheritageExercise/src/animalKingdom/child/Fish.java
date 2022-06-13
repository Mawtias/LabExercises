package animalKingdom.child;
import animalKingdom.parent.Animal;

public class Fish extends Animal{
	
	private String habitat;
	private boolean hasGills;
	
	public String getHabitat() {
		return habitat;
	}
	public boolean isHasGills() {
		return hasGills;
	}
	public Fish(float height, float weight, String animalType, String bloodType, String habitat, boolean hasGills) {
		super(height, weight, animalType, bloodType);
		this.habitat = habitat;
		this.hasGills = hasGills;
	}
	
	
	
	
}
