
public class TestClass {
	
	public static void main(String[] args) {
		Pair<Integer, String> pair = Pair.of(1, "hello");
		Integer i = pair.getFirst(); //-> 1
		String s = pair.getSecond(); //-> "hello"
		System.out.println(i);
		System.out.println(s);
		Pair<Integer, String> pair2 = Pair.of(1, "hello");
		Pair<Integer, String> pairWithNull = Pair.of(1, null);
		System.out.println(pair.equals(pair2));
		System.out.println(pair.equals(pairWithNull));
		
	}
	
	

}
