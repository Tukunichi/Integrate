
public class TestClass {
	
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		System.out.println(tc.integrate(1, 1, 10));
	}
	
	public double integrate(int fun, double leftBorders, double rightBorders) {
		double step = 0.1;
		double square = 0;
		double i1 = 0;
		
		for(double i = leftBorders; i <= rightBorders; i = i + step) {
			double a = step * fun;
			square = square + a;
			i1 = i1+1;
		}
		
		return square;
	}

}