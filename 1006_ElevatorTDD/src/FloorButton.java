
public class FloorButton {

	int floorNo;
	FloorPanel fp;
	boolean pressed=false;	//true for pressed
	//ElevatorControlPanel ecp;
	private String direction;
	
	
	public FloorButton(String direction) {
	System.out.println(direction+" Floor Button Created.");	
		this.direction = direction;
	
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
