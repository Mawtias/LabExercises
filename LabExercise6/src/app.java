
public class app {
	
	public static void main(String[] args) {
		app app = new app();
		System.out.println("The maximum number is: " + app.getMaximum(17, 11, 20f));
		
	}
	
	<T extends Number> T getMaximum(T x, T y, T z) {
		if(x.doubleValue() > y.doubleValue() && x.doubleValue() > z.doubleValue()) {
			return x;
		}else if (y.doubleValue() > z.doubleValue())return y;
		else return z;
	}
}
