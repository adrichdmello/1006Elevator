
public class FloorButton {

	int floorNo;
	FloorPanel fp;
	boolean pressed=false;	//true for pressed
	//ElevatorControlPanel ecp;
	private String direction;
	
	
	public FloorButton(String direction) {
		
		this.direction = direction;
	//7	this.floorNo = fp.getFloor().getFloorNo();
		//this.fp = floorPanel;
		
	}
	
	public FloorButton(int floorNo2, FloorPanel floorPanel) {
		// TODO Auto-generated constructor stub
	}

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}	
	
	boolean FloorButtonPressed(){
		if(!isPressed()){
		pressed = true;
		}else
			pressed = false;
		//fp.makeRequest();
		//ecp.MoveElevator(floorNo);
		System.out.println("Floor Button pressed at floor "+floorNo);
		return pressed;
	}
}
