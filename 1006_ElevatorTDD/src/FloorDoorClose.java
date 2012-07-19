
public class FloorDoorClose implements FloorDoorState{

FloorDoor fDoor;
ElevatorDoor ed;

public FloorDoorClose(){

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

/*@Override
	public boolean changeState() throws CloseException {
		
		if(!ed.isDoorState() && ed.isOpenable()){
			fDoor.setState(new FloorDoorOpen(fDoor));
			return true;
		}
		else 
			throw new CloseException();
	}
*/
}
