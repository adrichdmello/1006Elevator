import java.util.AbstractList;
import java.util.ArrayList;


public class Building {
	ArrayList<Floor>  floors;
	Elevator myElevator;
	int i;
	
	public Building(int noOfFloors){
		System.out.println("Building Created with "+noOfFloors+" Floors");
		myElevator = new Elevator(noOfFloors, this);
		for(i=0; i<noOfFloors;i++)
		floors.add(new Floor(i));
	}

}
