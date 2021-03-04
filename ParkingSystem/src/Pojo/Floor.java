package Pojo;

import java.util.*;

public class Floor {
	//make it as singleton
	int floorNo;
	Map<Integer,Spot>spots;//sport number will be key 
	Map<Integer,Spot>veMap;
	public int availableSpots=0;
	int capacity;
	
	public static Floor floor=null;
	
	public static Floor getFloorInstance()
	{
		if(floor==null)
		{
			floor=new Floor();
		}
		return floor;
	}
	
	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void addSpotIntoFloor()
	{
		
	}
	public void addvehicleintoSpot(Vehicle vehicle,int spotNumber){
		
		
	}
	
	public void initliazeFloor(int capacity,int floorNo)
	{
		this.capacity=capacity;
		this.floorNo=floorNo;
		availableSpots+=capacity;
		veMap=new HashMap<Integer, Spot>();
		spots=new HashMap<Integer, Spot>();
		for(int i=0;i<capacity;i++) {
			spots.put(i,new CompactSpot());
		}
	}
	
	public Map<Integer, Spot> getVeMap() {
		return veMap;
	}

	public void setVeMap(Map<Integer, Spot> veMap) {
		this.veMap = veMap;
	}

	public Spot getAvailableSlot() throws Exception
	{
		Iterator<Integer>itr=spots.keySet().iterator();
		int number;
		while(itr.hasNext())
		{
			number=itr.next();
			if(!spots.get(number).filled)
			{
				return spots.get(number);
			}
		}
		throw new Exception("Floor is full");
	
	}
	public void decreaseAvailbaleSpot()
	{
		availableSpots--;
	}
	public void increaseAvailbaleSpot()
	{
		availableSpots++;
	}

}
