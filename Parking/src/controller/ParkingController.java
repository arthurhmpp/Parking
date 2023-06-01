package controller;

import java.time.LocalDateTime;
/**
 * @param licensePlate license plate vehicle
 * @param carBrand vehicle's brand car 
 * @param model vehicle's model
 * @param color vehicle's color
 * @throw ParkingException when parking would be full
 * @throw VehicleException when default license plate was invalid
 */

import java.util.List;

import model.Checkinout;
import model.ParkingSpace;
import model.Vehicle;
import repository.DAOParking;
import util.ParkingUtil;

public class ParkingController {
	public void  checkin(String licensePlate, String model, String carBrand, String color) throws ParkingException, VehicleException {
		//check if parking is full
		if(!ParkingSpace.freeParkingSpace()) {
			throw new ParkingException("Estacionamento lotado!");
		}
		// check default license plate
		if(!ParkingUtil.validLicensePlate(licensePlate)) {
			throw new VehicleException("Placa informada inválida!");
		}
		//create a vehicle's instance
		Vehicle vehicle = new Vehicle(licensePlate, carBrand, model, color);
		
		//create a link between vehicle and entry date
		Checkinout checkinout = new Checkinout(vehicle, LocalDateTime.now());
		//insert the information in db
		DAOParking dao = new DAOParking();
		dao.insert(checkinout);
		//update the number of occupied space 
		ParkingSpace.updateparkingspace();
		
	}
	
	public Checkinout checkout(String lincensePlate) {
		//TODO implement
		return null;
	}
	
	public List<Checkinout> IssueReport(LocalDateTime date){
		//TODO implement
		return null;
	}
}
