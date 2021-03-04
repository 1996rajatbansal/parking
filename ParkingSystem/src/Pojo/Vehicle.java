package Pojo;

import Enums.VehcileTypeEnum;

public abstract class Vehicle {
	
	String vechileNo;
	VehcileTypeEnum vehcileType;
	ParkingTicket parkingTicket;
	
	public void assignParkingTicketTovehicle(ParkingTicket parkingTicket)
	{
		this.parkingTicket=parkingTicket;
	}

	public String getVechileNo() {
		return vechileNo;
	}

	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}

	public VehcileTypeEnum getVehcileType() {
		return vehcileType;
	}

	public void setVehcileType(VehcileTypeEnum vehcileType) {
		this.vehcileType = vehcileType;
	}

	public ParkingTicket getParkingTicket() {
		return parkingTicket;
	}

	public void setParkingTicket(ParkingTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}
}
