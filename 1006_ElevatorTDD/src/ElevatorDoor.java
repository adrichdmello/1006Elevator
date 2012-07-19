
public class ElevatorDoor {

	boolean doorState;		//whether door is open or closed. True for open
	
	
	boolean openable; 		//whether door is openable or not
	Elevator elevator;
	
	//String status="closed";
	
	public ElevatorDoor(Elevator elevator) {
		System.out.println("Elevator Door Created");
		this.elevator = elevator;
		this.doorState = false;
		this.openable = true;
		
	}
	
	
	public boolean isDoorState() {
		return doorState;
	}

	public void setDoorState(boolean doorState) {
		this.doorState = doorState;
	}

	
	public boolean isOpenable() {
		return openable;		//true for open
	}

	public void setOpenable(boolean openable) {
		this.openable = openable;
	}
	
	
	boolean eDoorOpen() throws OpenException{
		if(isOpenable() && doorState==false){
		System.out.println("code for opening Elevator door");	
		setDoorState(true);
		setOpenable(false);
		return true;
		}
		else {
			throw new OpenException();
		}
		
	}
	
	boolean eDoorClose() throws OpenException{
		if(!isOpenable() && doorState==true){
		System.out.println("code for closing Elevator door");
		setDoorState(false);
		setOpenable(true);
		return true;
		}
		else {
			throw new OpenException();
		}
		
	}
	
}