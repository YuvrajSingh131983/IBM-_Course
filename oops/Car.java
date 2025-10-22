package oops;

public class Car {
	private String brand;
	private String model;
	private Engin engine;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engin engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + "]";
	}
	public Car(String brand, String model, Engin engine) {
		super();
		this.brand = brand;
		this.model = model;
		this.engine = engine;
	}
	public Car() {
		super();
	}
	
}
