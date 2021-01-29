
public class MailMessage extends SuperClass{
	
	private String from, to, content;
	
	public MailMessage(String from, String to, String content) {
		super(from, to);
		this.content = content;
		
	}
	
	@Override
	public String getContent() {
		return content;
	}
}