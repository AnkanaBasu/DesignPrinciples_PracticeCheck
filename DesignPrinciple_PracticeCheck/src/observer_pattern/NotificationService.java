package observer_pattern;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new LinkedList<>();
	private static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);
	
	@Override
	public void addSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		LOGGER.info("------------List Of Observers----------");
		observers.forEach(o -> LOGGER.info(o.toString()));
		LOGGER.info("---------------------------------------");

	}

	@Override
	public void removeSubscriber(INotificationObserver observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
		LOGGER.info("-------------List Of Observers----------");
		observers.forEach(o -> LOGGER.info(o.toString()));
		LOGGER.info("----------------------------------------");

	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub

		observers.forEach(o -> o.onServerDown());
	}

}
