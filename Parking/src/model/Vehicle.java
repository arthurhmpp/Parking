package model;

/***
 * 
 * @author arthurhmp
 *represents the vehicle parked in parking
 *
 */

public class Vehicle {
	private String licensePlate;
	private String CarBrand;
	private String model;
	private String color ;
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public String getCarBrand() {
		return CarBrand;
	}
	
	public void setCarBrand(String carBrand) {
		CarBrand = carBrand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Vehicle(String licensePlate, String carBrand, String model, String color) {
		super();
		this.licensePlate = licensePlate;
		this.CarBrand = carBrand;
		this.model = model;
		this.color = color;
	}
	
	
}
