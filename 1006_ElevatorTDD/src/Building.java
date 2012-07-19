import java.util.ArrayList;

public class Building {

	ArrayList<Floor> floors = new ArrayList<Floor>();
int i;
Elevator elevator;
Building(int noOfFloors)
{
	System.out.println("Building Created with "+noOfFloors+" Floors");
	elevator = new Elevator(noOfFloors, this);
	for(i=0; i<noOfFloors;i++)
	floors.add(new Floor(i,this));
}
	public Floor getFloors(int floorNumber) {
	return floors.get(floorNumber);
}

public Elevator getElevator() {
		return elevator;
	}

	public void setElevator(Elevator elevator) {
		this.elevator = elevator;
	}

public void setFloors(ArrayList<Floor> floors) {
	this.floors = floors;
}

	
	
	public ArrayList<Floor> getFloor()
	{
		return floors;
	}
	
	public void addFloor(Floor floor){
		floors.add(floor);
	}
	
	public int getNumberOfFloor(){
		return floors.size();
	}

	public Elevator addElavator(Elevator elevator) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
