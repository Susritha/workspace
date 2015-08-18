package beans;

public class Car {
Wheels wheels;

public Wheels getWheels() {
	return wheels;
}

public void setWheels(Wheels wheels) {
	this.wheels = wheels;
}
public void moving(){
	wheels.rotating();
	System.out.println("Car is moving..");
}
}
