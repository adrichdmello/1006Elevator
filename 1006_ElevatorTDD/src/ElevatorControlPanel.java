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

}
