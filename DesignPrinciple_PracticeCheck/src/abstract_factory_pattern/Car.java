package abstract_factory_pattern;

public abstract class Car {

	protected CarType model;
	protected Location location;
	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	@Override
	public String toString() {
		return "CarModel - " + model + " located in " + location ;
	}
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public abstract void construct();
	
}
