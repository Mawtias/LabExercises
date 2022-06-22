
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class Question3 {
	
	public static class Car implements Comparator<Car>{
		private String make;
		private String model;
		private int year;
		
		Car(String make, String model, int year){
			this.make = make;
			this.model = model;
			this.year = year;
		}
		
		@Override
		public String toString() {
			
			return "\nmake: " + make +  "		model: " + model + "	year: " + year;
		}

		@Override
		public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
			if(o1.year < o2.year)return 1;
			else return 0;
		} 
	}
	
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Chevrolet", "Cruze", 2021));
		carList.add(new Car("Fiat", "Uno", 2014));
		carList.add(new Car("Fiat", "Pulse", 2022));
		carList.add(new Car("Volks",  "Fox",2008));
		System.out.println(carList);
		
		for ( Car c: carList) {			
			for (int i = 0; i < carList.size()-1; i++) {
				if(carList.get(i).compare(carList.get(i), carList.get(i+1))== 0) {
					Car tempCar = carList.get(i);
					carList.set(i, carList.get(i+1));
					carList.set(i+1, tempCar);
				}			
			}
		}
		
		
		System.out.println(carList);		
		
	}
}
