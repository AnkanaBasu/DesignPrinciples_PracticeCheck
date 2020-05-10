package observer_pattern;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		INotificationObserver steve=new SteveObserver();
		INotificationObserver john=new JohnObserver();
		
		INotificationService service=new NotificationService();
		
		service.addSubscriber(john);
		service.addSubscriber(steve);
		
		service.notifySubscriber();
		
		service.removeSubscriber(john);

	}

}
