package animalKingdom.child;
public class Eagle  extends Birds{

	
	

	public Eagle(float height, float weight, String animalType, String bloodType, boolean hasFeathers, boolean fly) {
		super(height, weight, animalType, bloodType, hasFeathers, fly);
		
	}
	
	public String ShowInfo() {
		return "Eagle: " + "   Type - "+  getAnimalType() +"    Height - " + getHeight() + "    Weight - " + getWeight()  + "    Blood - " + getBloodType()
		+ "    Feathers - " + isHasFeathers() + "    Fly - " + isFly();
	}
	
	
}
