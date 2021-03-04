package Pojo;

import Enums.VehcileTypeEnum;

public class CarClass extends Vehicle{
	
	public CarClass(int vehicleId)
	{
		vehcileType=VehcileTypeEnum.CAR;
		vehicleId=vehicleId;
	}

}
