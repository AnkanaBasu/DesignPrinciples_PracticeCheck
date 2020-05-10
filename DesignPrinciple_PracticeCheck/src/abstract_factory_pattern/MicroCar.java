package abstract_factory_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MicroCar extends Car {

	private static final Logger LOGGER = LoggerFactory.getLogger(MicroCar.class);
	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
		LOGGER.info("From: "+location);
	}
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to Micro car ");

	}

}
