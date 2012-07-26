
public class FloorButton {

	int floorNo;
	FloorPanel fp;
	boolean pressed=false;	//true for pressed
	//ElevatorControlPanel ecp;
	private String direction;
	
	
	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public FloorButton(String direction,FloorPanel fp) {
	System.out.println(direction+" Floor Button Created.");	
		this.direction = direction;
		this.fp = fp;
	
	}
	
	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}	
	
	boolean FloorButtonPressed() throws OpenException, CloseException{
		System.out.println("Floor Button pressed at floor "+fp.getFloorNo());
		if(!isPressed()){
		pressed = true;
		}else
			pressed = false;
		fp.makeRequest();
		//ecp.MoveElevator(floorNo);
	
		return pressed;
	}
}
