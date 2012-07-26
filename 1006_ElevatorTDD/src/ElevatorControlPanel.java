import java.util.ArrayList;


public class ElevatorControlPanel {
Elevator elevator;
ArrayList<ElevatorButton> eb = new ArrayList<ElevatorButton>();
int i;

	public ElevatorControlPanel(int numOfFloor, Elevator elevator) {
		// TODO Auto-generated constructor stub
		this.elevator = elevator;
		System.out.println("ElevatorControlPanel Created.");
		for(i=0;i<numOfFloor;i++)
		{
		this.eb.add(new ElevatorButton(i,this));
		}
	}

	public void makeRequest(int buttonNo) throws OpenException, CloseException {
		// TODO Auto-generated method stub

		elevator.goToFloor(buttonNo);
//		if(this.eb.get(0).getButtonNo() > this.elevator.building.floors.get(0).getFloorNo())
//		{
//			elevator.moveUp(this.eb.get(0).getButtonNo());	
//		}
//		else
//			elevator.moveDown(this.eb.get(0).getButtonNo());

	}
	
	
	public ElevatorButton getElevatorButtonNo(int j){
		return eb.get(j);
	}

}
