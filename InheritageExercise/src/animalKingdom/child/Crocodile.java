package animalKingdom.child;
import animalKingdom.child.Reptile;

public class Crocodile extends Reptile{
	
	
	public Crocodile(float height, float weight, String animalType, String bloodType, String skinType, String bone, String eggType){
		super(height, weight, animalType, bloodType, skinType, bone, eggType);
	}

	
	public String ShowInfo() {
		return "Crocodile: " + "   Type - "+  getAnimalType() +"    Height - " + getHeight() + "    Weight - " + getWeight()  + "    Blood - " + getBloodType()
				+ "    Skin - " + getSkinType() + "    Bone - " + getBone() + "    Egg - "
				+ getEggType();
	}
	
	
}
