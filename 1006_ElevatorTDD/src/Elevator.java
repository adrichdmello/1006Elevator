import java.util.ArrayList;


public class Elevator {

	//Floor floor;
	int numOfFloor,floorNumber;
	Building building;
	//ArrayList<Floor> floors;
	ElevatorDoor elevatorDoor;
	ElevatorControlPanel ecp ;
	boolean moving;

	
	
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
//	public void moveUp() {
//		
//	}
//	
//public void moveDown() {
//		
//	}
//
//
//public int getNumOfFloor() {
//	return numOfFloor;
//}
//
//public void setNumOfFloor(int numOfFloor) {
//	this.numOfFloor = numOfFloor;
//}
//
//public int getFloorNumber() {
//	return floorNumber;
//}
//
//public void setFloorNumber(int floorNumber) {
//	this.floorNumber = floorNumber;
//}
//
//public ArrayList<Floor> getFloors() {
//	return floors;
//}
//
//public void setFloors(ArrayList<Floor> floors) {
//	this.floors = floors;
//}
}
