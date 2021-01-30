import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MailService<T> extends HashMap<String, List<T>> implements Consumer<SuperClass> {

	
	public Map<String, List<T>> getMailBox(){
		return this;
	}
	
	@Override
	public List<T> get(Object key) {
		// TODO Auto-generated method stub
		if(!containsKey(key)) return Collections.<T>emptyList();
		else return super.get(key);
	}

	@Override
	public void accept(SuperClass t) {
		// TODO Auto-generated method stub
		if(containsKey(t.getTo())){
			List<T> list = (List<T>) get(t.getTo());
			ArrayList<T> array = new ArrayList<T>();
			list.stream().forEachOrdered(e -> {
				array.add(e);
			});
			array.add(t.getContent());
			replace(t.getTo(), array);
		}
		else{
			put((String)t.getTo(), Arrays.asList((T)t.getContent()));
		}
	}

	
	
}
