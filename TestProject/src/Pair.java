
public class Pair<T1, T2> {
	
	private T1 firstValue;
	private T2 secondValue;

	
	private Pair(T1 firstValue, T2 secondValue){
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}
	
	public static <T1,T2> Pair<T1,T2> of(T1 first, T2 second){
		Pair<T1,T2> pair1 = new Pair<T1, T2>(first, second);
		return pair1;
	}
	
	public T1 getFirst() {
		return firstValue;
	}
	
	public T2 getSecond() {
		return secondValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstValue == null) ? 0 : firstValue.hashCode());
		result = prime * result + ((secondValue == null) ? 0 : secondValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (firstValue == null) {
			if (other.firstValue != null)
				return false;
		} else if (!firstValue.equals(other.firstValue))
			return false;
		if (secondValue == null) {
			if (other.secondValue != null)
				return false;
		} else if (!secondValue.equals(other.secondValue))
			return false;
		return true;
	}
	
	
}

