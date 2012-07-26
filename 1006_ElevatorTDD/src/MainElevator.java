
public class MainElevator {

	/**
	 * @param args
	 * @throws OpenException 
	 * @throws CloseException 
	 */
	public static void main(String[] args) throws OpenException, CloseException {
		// TODO Auto-generated method stub
	Building b = new Building(5);
	FloorButton fl3UpButton = b.getFloors(2).getFloorPanel().getUpFButton();
	fl3UpButton.FloorButtonPressed();
	
	ElevatorButton el5Button = b.getElevator().getEcp().getElevatorButtonNo(4);
	el5Button.ElevatorButtonPressed();
	}

}
