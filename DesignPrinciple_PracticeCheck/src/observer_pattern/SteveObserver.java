package observer_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver {
	private static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);
	String name = "Steve";
	@Override
	public void onServerDown() {
		// TODO Auto-generated method stub
    LOGGER.info(name + " recived a notification");

	}
	@Override
	public String toString() {
		return "SteveObserver [name=" + name + "]";
	}

}
