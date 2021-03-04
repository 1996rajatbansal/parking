package Admin;

import Pojo.ParkingTicket;
import Pojo.Vehicle;

public interface SystemOperations {
	
	 void checkInVehicle(int vehicleID);
	 ParkingTicket checkOutVehicle(int vehicleID) throws Exception;
	 boolean searchVehicle(int vehicleId);
	 int findEmptySpaces();

	 
	
}
