import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorDoorCloseTest {
	
	FloorDoorOpen fdsOpen;
	FloorDoorClose fdsClose;
	FloorDoor fDoor;
	ElevatorDoor ed;			//Change afterwards
	
	@Before
	public void setUp() throws Exception {
		fdsClose = new FloorDoorClose();
		fdsOpen = new FloorDoorOpen(fDoor);
		ed = new ElevatorDoor();				//check
	}

	@Test
	public void testChangeStateValid() {
//		fail("Not yet implemented");
		ed.doorState = true;    // ed.setDoorState(true);
		ed.openable = true;
		
		
	}

}
