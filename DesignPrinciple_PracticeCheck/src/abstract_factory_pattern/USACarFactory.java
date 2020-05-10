package abstract_factory_pattern;

public class USACarFactory extends CarFactory {

	public USACarFactory(CarType type) {
		super(Location.USA, type);
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
