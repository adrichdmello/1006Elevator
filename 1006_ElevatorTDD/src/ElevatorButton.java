
public class ElevatorButton {

	ElevatorControlPanel ecp;
	int buttonNo;
	boolean pressed=false;	
	
	public ElevatorControlPanel getEcp() {
		return ecp;
	}

	public void setEcp(ElevatorControlPanel ecp) {
		this.ecp = ecp;
	}

	public int getButtonNo() {
		return buttonNo;
	}

	public void setButtonNo(int buttonNo) {
		this.buttonNo = buttonNo;
	}

	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public ElevatorButton(int buttonNo, ElevatorControlPanel elevatorControlPanel) {
		// TODO Auto-generated constructor stub
		this.buttonNo = buttonNo;
		this.ecp =elevatorControlPanel;
		System.out.println("ECP Button created " +buttonNo);
		
	}

	boolean ElevatorButtonPressed() throws OpenException, CloseException {
		//System.out.println("Floor Button pressed at floor "+fp.getFloorNo());
		if(!isPressed()){
		pressed = true;
		}else
			pressed = false;
		System.out.println("Elevator Button " + this.getButtonNo()+ " is pressed");
		ecp.makeRequest(buttonNo);
		//ecp.MoveElevator(floorNo);
	
		return pressed;
	}
}
