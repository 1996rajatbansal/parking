package Admin;

import java.sql.Timestamp;

import Pojo.CarClass;
import Pojo.CompactSpot;
import Pojo.Floor;
import Pojo.ParkingTicket;
import Pojo.Spot;
import Pojo.Vehicle;

public class SystemOperationsImpl implements SystemOperations {

	Floor floor=Floor.getFloorInstance();
	
	@Override
	public void checkInVehicle(int vehicleID) {
		
		try {
		CompactSpot spot=(CompactSpot) floor.getAvailableSlot();
		spot.setFilled(true);
		ParkingTicket parkingTicket=getParkingTicket(floor.getFloorNo(), spot.getSpotNumber());
		parkingTicket.setVehicleCheckInTime(new Timestamp(System.currentTimeMillis()));
		Vehicle carClass=new CarClass(vehicleID);
		carClass.assignParkingTicketTovehicle(parkingTicket);
		spot.assignVehicleToSpot(carClass);
		floor.decreaseAvailbaleSpot();		
		floor.getVeMap().put(vehicleID,spot);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public ParkingTicket checkOutVehicle(int vehicleID) throws Exception {
		// TODO Auto-generated method stub
		if(this.searchVehicle(vehicleID))
		{
			
			
			Spot spot=floor.getVeMap().get(vehicleID);
			ParkingTicket parkingTicket=spot.getVehicle().getParkingTicket();
			parkingTicket.setVehicleCheckoutTime(new Timestamp(System.currentTimeMillis()));
			spot.setFilled(false);
			spot.removeVehicleFromSpot();
			floor.increaseAvailbaleSpot();
			floor.getVeMap().remove(vehicleID);
			System.out.println("Ticket:"+parkingTicket.toString());
			return parkingTicket;
			
		
		}
		throw new Exception("Vehicle Not FOund..");
		
		
		
		
		
	}

	@Override
	public boolean searchVehicle(int vehicleId) {
		// TODO Auto-generated method stub
		if(floor.getVeMap().containsKey(vehicleId))
		{
			System.out.println("Vehcile Found..");
			return true;
		}
		System.out.println("Vehcile Not Found..");
		return false;
		
	}

	@Override
	public int findEmptySpaces() {
		// TODO Auto-generated method stub
		System.out.println("Available Spots:"+floor.availableSpots);
		return floor.availableSpots;
	}
	
	public ParkingTicket getParkingTicket(int floorNo,int spotNumber)
	{
		return new ParkingTicket(floorNo, spotNumber);
	}

}
