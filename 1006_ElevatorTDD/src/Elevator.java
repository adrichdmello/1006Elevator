import java.util.ArrayList;


public class Elevator {

	//Floor floor;
	int numOfFloor;
	int floorNumber;	//current floor
	//ArrayList<Floor> floors;
		ElevatorDoor elevatorDoor;
		ElevatorControlPanel ecp ;
		public ElevatorControlPanel getEcp() {
			return ecp;
		}

		public void setEcp(ElevatorControlPanel ecp) {
			this.ecp = ecp;
		}

		boolean moving;

		

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	Building building;
	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	
	
	public Elevator(int noOfFloors, Building building) {

		System.out.println("Elevator Created");
		elevatorDoor = new ElevatorDoor(this);
		//just check
		numOfFloor = noOfFloors;
		ecp = new ElevatorControlPanel(numOfFloor, this); 
		this.floorNumber = 0;				//for moving 
		this.building = building;
		//this.floors = floors;
		//this.moving = false;

	}

//	public void StopElevator(){
//	System.out.println("")
//		
//	}
//	public Building getBuilding() {
//		return building;
//	}
//
//	public void setBuilding(Building building) {
//		this.building = building;
//	}
//
	public int moveUp(int floorNo) throws OpenException, CloseException {

		System.out.println("Start of MoveUp");
		startElevator();
		
		while (floorNumber< floorNo)
		{

			floorNumber++;
			System.out.print("Elevator is moving Up");
		//	this.getBuilding().getFloor().get(0).getFloorPanel().getUpFButton().getDirection();
			System.out.println("Reached floor "+floorNumber);
		}
		
		stopElevator();
		System.out.println("Start of MoveUp");
		return floorNumber;
		
	}
	
	public void stopElevator() throws OpenException{
		System.out.println("Elevator Stopped");
		
		this.building.floors.get(0).floorDoor.fDoorOpen();
		this.elevatorDoor.eDoorOpen();
		

	} 
	
	public void  startElevator() throws CloseException, OpenException {
	if(this.elevatorDoor.doorState==true && this.building.floors.get(0).floorDoor.fDoorState == true)
		{	
		this.building.floors.get(0).floorDoor.fDoorClose();
		this.elevatorDoor.eDoorClose();
		}
	
	}
	
	
public int moveDown(int floorNo) throws OpenException, CloseException {
System.out.println("Start of MoveDown");
    startElevator();
    
	while (floorNumber > floorNo)
	{

		floorNumber--;
		System.out.print("Elevator is moving Down");
		System.out.println("Reached floor "+floorNumber);
	}
	
	stopElevator();
	System.out.println("end of MoveDown");
	return floorNumber;
	}


public ArrayList<Floor> goToFloor(int destination) throws OpenException, CloseException {
	//System.out.println("in go to floor");
if(floorNumber< destination)
		{
			this.moveUp(destination);
		}
		else {
			moveDown(destination);
		}
	return building.floors;
	}

public int getFloorNumber() {
	return floorNumber;
}

}
