
public class Floor {

	FloorDoor fDoor;
	FloorPanel fPanel;
	int floorNo;
	Elevator elevator;
	

	


//	public Floor(int floorNo, FloorDoor fDoor,FloorPanel fPanel) {
//	this.floorNo = floorNo;
//	this.fDoor = new FloorDoor();
//	this.fPanel = fPanel;
//	}
//	
	public Floor(int floorNo, Elevator myElevator) {
		// TODO Auto-generated constructor stub
		this.floorNo = floorNo;
		this.elevator = myElevator;
		this.fDoor = new FloorDoor();
		this.fPanel = new FloorPanel(floorNo,this);
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	public Elevator getElevator() {
		// TODO Auto-generated method stub
		return elevator;
	}
	

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}
}
