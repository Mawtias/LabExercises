package animalKingdom.child;
import animalKingdom.parent.Animal;

public class Reptile extends Animal{
	private String skinType;
	private String bone;
	private String eggType;
	
	public String getSkinType() {
		return skinType;
	}
	
	public String getBone() {
		return bone;
	}
	
	public String getEggType() {
		return eggType;
	}

	public Reptile(float height, float weight, String animalType, String bloodType, String skinType, String bone, String eggType) {
		super(height, weight, animalType, bloodType);
		this.skinType = skinType;
		this.bone = bone;
		this.eggType = eggType;
	}
	
	
	
	
}
