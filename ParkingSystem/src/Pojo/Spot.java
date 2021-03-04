package Pojo;

import Enums.SpotTypeEnum;

public abstract class Spot {
	
	int spotNumber;
	SpotTypeEnum spotType;
	Vehicle vehicle;
	boolean filled=false;
	public int getSpotNumber() {
		return spotNumber;
	}
	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}
	public SpotTypeEnum getSpotType() {
		return spotType;
	}
	public void setSpotType(SpotTypeEnum spotType) {
		this.spotType = spotType;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void assignVehicleToSpot(Vehicle vehicle)
	{
		this.vehicle=vehicle;
	}
	
	public void removeVehicleFromSpot()
	{
		this.vehicle=null;
	}
}
