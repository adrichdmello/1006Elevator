
public class Floor {

Building building;
int floorNo;
FloorDoor floorDoor;
FloorPanel floorPanel;

	public Building getBuilding() {
	return building;
}

public void setBuilding(Building building) {
	this.building = building;
}

public FloorDoor getFloorDoor() {
	return floorDoor;
}

public void setFloorDoor(FloorDoor floorDoor) {
	this.floorDoor = floorDoor;
}

public FloorPanel getFloorPanel() {
	return floorPanel;
}

public void setFloorPanel(FloorPanel floorPanel) {
	this.floorPanel = floorPanel;
}

	public int getFloorNo() {
	return floorNo;
}

public void setFloorNo(int floorNo) {
	this.floorNo = floorNo;
}

	public Floor(int floorNo,Building building) {
		// TODO Auto-generated constructor stub
		int num = floorNo + 1;
		System.out.println("Floor "+num+ " Created.");
		this.floorNo = floorNo;
		this.building = building;
		floorPanel=new FloorPanel(floorNo, this);
		floorDoor = new FloorDoor(floorNo,this);
	}

	public void makeRequest() throws OpenException, CloseException {
		if(this.floorNo > building.elevator.getFloorNumber()){

			building.elevator.moveUp(this.floorNo); 
	
		}else if(this.floorNo == building.elevator.getFloorNumber()){
			this.floorDoor.fDoorOpen();
			this.building.elevator.elevatorDoor.eDoorOpen();
		}else{
			building.elevator.moveDown(this.floorNo); 
		}
			
	
		
		
	}

	

}
