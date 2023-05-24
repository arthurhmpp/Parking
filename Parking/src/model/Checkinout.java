package model;

import java.time.LocalDateTime;


/***
 * 
 * @author arthurhmp
 *
 *information about entry/exit of vehicle and cost
 *
 */
public class Checkinout {

	private Vehicle vehicle;
	private LocalDateTime DateCheckin;
	private LocalDateTime DateCheckout;
	private double price;
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public LocalDateTime getDateCheckin() {
		return DateCheckin;
	}
	public void setCheckin(LocalDateTime DateCheckin) {
		this.DateCheckin = DateCheckin;
	}
	public LocalDateTime getDateCheckout() {
		return DateCheckout;
	}
	public void setCheckout(LocalDateTime DateCheckout) {
		this.DateCheckout = DateCheckout;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Checkinout(Vehicle vehicle, LocalDateTime DateCheckin, LocalDateTime DateCheckout, double price) {
		super();
		this.vehicle = vehicle;
		this.DateCheckin = DateCheckin;
	}
	
	
}
