package Pojo;

import java.sql.Timestamp;

public class ParkingTicket {
	
	int floorNo;
	int spotNo;
	Timestamp vehicleCheckInTime;
	Timestamp vehicleCheckoutTime;
	
	public ParkingTicket(int floorNo,int spotNo) {
		// TODO Auto-generated constructor stub
		this.floorNo=floorNo;
		this.spotNo=spotNo;
	}
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getSpotNo() {
		return spotNo;
	}
	public void setSpotNo(int spotNo) {
		this.spotNo = spotNo;
	}
	public Timestamp getVehicleCheckInTime() {
		return vehicleCheckInTime;
	}
	public void setVehicleCheckInTime(Timestamp vehicleCheckInTime) {
		this.vehicleCheckInTime = vehicleCheckInTime;
	}
	public Timestamp getVehicleCheckoutTime() {
		return vehicleCheckoutTime;
	}
	public void setVehicleCheckoutTime(Timestamp vehicleCheckoutTime) {
		this.vehicleCheckoutTime = vehicleCheckoutTime;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return floorNo+" "+spotNo+" "+vehicleCheckInTime+" "+vehicleCheckoutTime;
	}

}
