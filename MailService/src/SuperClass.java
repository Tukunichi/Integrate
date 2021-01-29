
public abstract class SuperClass {
	
	private String from, to;
	
	public SuperClass(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	public String getTo() {
		return to;
	}
	
	public String getFrom() {
		return from;
	}
	
	public abstract <T> T getContent();
}
