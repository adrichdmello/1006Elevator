
public class FloorDoorOpen implements FloorDoorState {

	FloorDoor fDoor;
	ElevatorDoor ed;		//change afterwards
	
	public FloorDoorOpen(FloorDoor fDoor) {
		
		this.fDoor = fDoor;
	}

	@Override
	public boolean OpenFloorDoor() throws OpenException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean CloseFloorDoor() throws CloseException {
		// TODO Auto-generated method stub
		return false;
	}

	
	/*
	 * @Override(non-Javadoc)
	
	public boolean OpenFloorDoor() throws OpenException {
	//	if(!fDoor.isOpen()&& fDoor.isOpenable()){
			System.out.println("Code for openeing Floor door");
//			fDoor.setOpen(true);
			fDoor.setOpenable(false);
			return true;
		}
		else {
			throw new OpenException();
			//return false;
		}
		
	}
*/
	

}
