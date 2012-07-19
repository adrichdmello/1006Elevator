import java.util.ArrayList;


public class ElevatorControlPanel {

	Elevator elevator;
	ArrayList<ElevatorButton> eb;
	
	public ElevatorControlPanel(Elevator elevator) {
		this.elevator = elevator;
		
		for(int i=0; i<elevator.building.floors.size();i++)
		{
			eb.add(new ElevatorButton(i));
		}
		
		

	}
	
	
	public void MoveElevator(int floorNo) {
		// TODO Auto-generated method stub
		System.out.println("Move elevator from Ecp");
		
	
	}

}
