package abstract_factory_pattern;

public abstract class CarFactory {
protected Location location;
protected CarType type;

public CarFactory(Location location,CarType type) {
	
	this.location = location;
	this.type=type;
}

public Location getLocation() {
	return location;
}

public CarType getType() {
	return type;
}

public void setType(CarType type) {
	this.type = type;
}

public void setLocation(Location location) {
	this.location = location;
}
public abstract Car getCar();
}
