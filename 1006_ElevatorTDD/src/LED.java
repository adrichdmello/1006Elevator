
public class LED {

	String dir;
	FloorPanel floorPanel;
	ElevatorControlPanel ecp;

	public LED(String dir)
	{
		System.out.println("Led "+dir+" Created");
		this.dir = dir;
	}
	
	public void isGoingUp(){
		System.out.println("^");
		
	}
	

	public void isGoingDown(){
		System.out.println("v");
		
	}
}
