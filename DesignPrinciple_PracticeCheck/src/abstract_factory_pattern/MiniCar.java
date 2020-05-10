package abstract_factory_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car {

	private static final Logger LOGGER = LoggerFactory.getLogger(MiniCar.class);
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
		LOGGER.info("From: "+location);
	}
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		LOGGER.info("Connecting to Mini car");

	}

}
