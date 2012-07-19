import java.util.ArrayList;


public class FloorPanel {
	
	//Building building;
	Floor floor;
	int floorNo;
	//ArrayList<FloorButton> fb = new ArrayList<FloorButton>();
	FloorButton upFButton;
	
	public FloorButton getDownFButton() {
		return downFButton;
	}

	public void setDownFButton(FloorButton downFButton) {
		this.downFButton = downFButton;
	}

	FloorButton downFButton;
	
	public FloorPanel(int floorNo, Floor floor) {
		System.out.println("Floor Panel Created");
	this.floor = floor;
	this.floorNo = floorNo;
	upFButton = new FloorButton("Up");
	downFButton = new FloorButton("Down");
	}
	
	public FloorButton getUpFButton() {
		return upFButton;
	}

	public void setUpFButton(FloorButton upFButton) {
		this.upFButton = upFButton;
	}


	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public int getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}

	
}
