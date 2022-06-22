package animalKingdom.child;
import animalKingdom.parent.Animal;

public class Birds extends Animal{
	
	private boolean hasFeathers;
	private boolean fly;
	
	public boolean isHasFeathers() {
		return hasFeathers;
	}
	public boolean isFly() {
		return fly;
	}
	public Birds(float height, float weight, String animalType, String bloodType, boolean hasFeathers, boolean fly) {
		super(height, weight, animalType, bloodType);
		this.hasFeathers = hasFeathers;
		this.fly = fly;
	}
	
	
	
}
