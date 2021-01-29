import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MailService<T> implements Consumer<SuperClass> {

	private Map map;
	
	public MailService() {
		map = new HashMap<String, List<T>>();
	}
	
	public Map<String, List<T>> getMailBox(){
		
		return map;
	}


	@Override
	public void accept(SuperClass t) {
		// TODO Auto-generated method stub
		if(map.containsKey(t.getTo())){
			List<T> list = (List<T>) map.get(t.getTo());
			ArrayList<T> array = new ArrayList<T>();
			list.stream().forEach(e -> {
				array.add(e);
			});
			array.add(t.getContent());
			map.replace(t.getTo(), Arrays.asList(array.toArray()));
		}
		else{
			map.put((String)t.getTo(), Arrays.asList((T)t.getContent()));
		}
	}

	
	
}
