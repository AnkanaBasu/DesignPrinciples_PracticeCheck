package abstract_factory_pattern;

public class IndianCarFactory extends CarFactory {

	public IndianCarFactory(CarType type) {
		super(Location.INDIA, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		Car car;
		if (getType() == CarType.LUXURY)
			car = new LuxuryCar(getLocation());
		else if (getType() == CarType.MICRO)
			car = new MicroCar(getLocation());
		else
			car = new MiniCar(getLocation());
		return car;
	}

}
