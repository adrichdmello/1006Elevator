import java.util.ArrayList;


public class FloorPanel {

	//ArrayList<FloorButton> fButton = new ArrayList<FloorButton>(); 
	Floor floor;
	FloorButton upButton, downButton;
	int floorNo;	
	boolean pressed;
	
	

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public FloorPanel(int floorNo,Floor floor2){
		pressed = false;
		this.floor = floor2;
		this.floorNo = floorNo;
		this.upButton =new FloorButton(floor.getFloorNo(), this);
		this.downButton =new FloorButton(floor.getFloorNo(),this);
		LED upLed = new LED("UP");
		LED downLed = new LED("Down");
	}
	
	void FloorUpButtonPressed(){
		//fButton.get(0).FloorButtonPressed();
		upButton.FloorButtonPressed();
		this.setPressed(true);
	}

	void FloorDownButtonPressed(){
		//fButton.get(0).FloorButtonPressed();
		downButton.FloorButtonPressed();
		this.setPressed(true);
	}

	public Floor getFloor() {
		return floor;
	}
	
	
	
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	public void makeRequest(){
		this.floor.getElevator().move();
	}
}
