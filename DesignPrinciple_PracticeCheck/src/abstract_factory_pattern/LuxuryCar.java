package abstract_factory_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {
	private static final Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
		LOGGER.info("From: "+location);
	}

	@Override
	public void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to Luxury car");
		
	}

}
