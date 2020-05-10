package observer_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class JohnObserver implements INotificationObserver{
	private static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);
	String name="John";
	@Override
	public void onServerDown() {
		// TODO Auto-generated method stub
		String res=name + " recived a notification";
		LOGGER.info(res);
		
	}
	@Override
	public String toString() {
		return "JohnObserver [name=" + name + "]";
	}

}
