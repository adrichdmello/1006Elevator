
public class FloorDoor {

	boolean fDoorState;		//whether door is open or closed. True for open
	boolean openable; 		//whether door is openable or not
	boolean elevatorIdle;	
	
	
	//String status="closed";
	
	


	public FloorDoor() {
		this.fDoorState = false;
		this.openable = true;
		this.elevatorIdle = true;
		
	}
	
	public boolean isElevatorIdle() {
		return elevatorIdle;
	}


	public void setElevatorIdle(boolean elevatorIdle) {
		this.elevatorIdle = elevatorIdle;
	}

	public boolean isfDoorState() {
		return fDoorState;
	}

	public void setfDoorState(boolean fDoorState) {
		this.fDoorState = fDoorState;
	}

	
	public boolean isOpenable() {
		return openable;		//true for open
	}

	public void setOpenable(boolean openable) {
		this.openable = openable;
	}
	
	
	boolean fDoorOpen() throws OpenException{
		if(isOpenable() && fDoorState==false && isElevatorIdle()){
		System.out.println("code for opening Floor door");	
		//setDoorState(true);
		setfDoorState(true);
		setOpenable(false);
		return true;
		}
		else {
			throw new OpenException();
		}
		
	}
	
	boolean fDoorClose() throws CloseException{
		if(!isOpenable() && isfDoorState() && isElevatorIdle() ){
		System.out.println("code for closing Floor door");
		//setDoorState(false);
		setfDoorState(false);
		setOpenable(true);
		return true;
		}
		else {
			throw new CloseException();
		}
		
	}
	
	/*
	 private FloorDoorState fDoorState;
	 boolean elevatorIdle;			//whether elevator moving or not
	 int floorNo;
	 boolean open=false;	//true for open
	 boolean openable = true;
	 
	
	 
	 public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public boolean isOpenable() {
		return openable;
	}

	public void setOpenable(boolean openable) {
		this.openable = openable;
	}

	public FloorDoor() {
		
		this.open = false;
		this.openable = true;
	}
	
	 public FloorDoorState getfDoorState() {
			return fDoorState;
		}
		public void setfDoorState(FloorDoorState fDoorState) {
			this.fDoorState = fDoorState;
		}
		
		
		public void OpenFloorDoor(){
			fDoorState.OpenFloorDoor();
		}
		
		public void CloseFloorDoor() {
			fDoorState.CloseFloorDoor();
		}
		*/
}
