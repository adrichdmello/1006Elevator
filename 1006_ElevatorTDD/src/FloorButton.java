
public class FloorButton {

	int floorNo;
	FloorPanel fp;
	boolean pressed=false;	//true for pressed
	ElevatorControlPanel ecp;
	
	
	public FloorButton(int floorNo, FloorPanel floorPanel) {
		this.floorNo = fp.getFloor().getFloorNo();
		this.fp = floorPanel;
	}
	
	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}	
	
	void FloorButtonPressed(){
		pressed = true;
		ecp.MoveElevator(floorNo);
		System.out.println("Floor Button pressed at floor "+floorNo);
	}
}
