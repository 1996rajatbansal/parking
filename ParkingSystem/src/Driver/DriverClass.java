package Driver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Admin.SystemOperationsImpl;
import Pojo.Floor;

public class DriverClass {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			SystemOperationsImpl obj=new SystemOperationsImpl();
			Floor floor=Floor.getFloorInstance();
			floor.initliazeFloor(10,1);

			String choice;
			while (true) {
				System.out.println("1:Checkin");
				System.out.println("2:CheckOut");
				System.out.println("3:search");
				System.out.println("4:findAvaiableSlots");
				System.out.println("5:Exit");
				choice = br.readLine();

				switch (choice) {
				case "1":
					System.out.println("enter vehilcle NO..");
					choice=br.readLine();
					obj.checkInVehicle(Integer.parseInt(choice));
					
					break;

				case "2":

					System.out.println("enter vehilcle NO..");
					choice=br.readLine();
					try {
						obj.checkOutVehicle(Integer.parseInt(choice));
						
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
					break;
				case "3":

					System.out.println("enter vehilcle NO..");
					choice=br.readLine();
					obj.searchVehicle(Integer.parseInt(choice));
					break;

				case "4":
					obj.findEmptySpaces();

					break;

				case "5":
					System.exit(0);

					break;
				default:
					break;
				}

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
