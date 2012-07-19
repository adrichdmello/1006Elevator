import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ElevatorDoorTest {

	ElevatorDoor ed;
	Elevator elevator;
	
	@Before
	public void setUp() throws Exception {
		ed = new ElevatorDoor(elevator);
	}

	@Test
	public void testEDoorOpenValid() {		//when door is closed and is openable
		try {
			ed.setDoorState(false);
			ed.setOpenable(true);
			assertEquals(true, ed.eDoorOpen());
		} catch (OpenException e) {
			
			System.out.println("Door is already open");
		}
	}

	
	@Test
	public void testEDoorOpenInvalid() {		//when door is already opened 
		try {
			ed.setDoorState(true);
			ed.setOpenable(false);				//even true wouldnt make difference
			assertEquals(true, ed.eDoorOpen());
		} catch (OpenException e) {
			
			System.out.println("Door is already open");
		}
	}
	
	@Test
	public void testEDoorCloseValid() {					//when door is open and is closeable
		try {
			ed.setDoorState(true);
			ed.setOpenable(false);
			assertEquals(true, ed.eDoorClose());
		}
		catch (OpenException e) {
			System.out.println("Door is already closed");
		}
		//fail("Not yet implemented");
		
	}
	
	
	@Test
	public void testEDoorCloseInvalid() {			//when door is close and is not closeable
		try {
			ed.setDoorState(false);
			ed.setOpenable(false);
			assertEquals(true, ed.eDoorClose());
		}
		catch (OpenException e) {
			System.out.println("Door is already closed");
		}
		
		
	}

}
