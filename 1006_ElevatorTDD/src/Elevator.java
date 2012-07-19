import java.util.ArrayList;


public class Elevator {
	int noOfFloor;
	Building building;
	ElevatorControlPanel ecp;
	ElevatorDoor ed;
	
	public Elevator(int noOfFloors, Building building) {
		this.building = building;
		this.noOfFloor =noOfFloors;
		ecp = new ElevatorControlPanel(this);
		ed = new ElevatorDoor();
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

}
