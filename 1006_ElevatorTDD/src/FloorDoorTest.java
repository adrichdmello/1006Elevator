import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorDoorTest {

	
	FloorDoor fd;
	
	@Before
	public void setUp() throws Exception {
		fd = new FloorDoor(4);
	}

	
	
	@Test
	public void testFDoorOpenValid() {		//when door is closed and is openable
		try {
			fd.setfDoorState(false);
			fd.setOpenable(true);
			assertEquals(true, fd.fDoorOpen());
		} catch (OpenException e) {
			
			System.out.println("Door is already open at floor "+fd.floorNo);
		}
	}

	
	
	@Test
	public void testFDoorOpenInvalid() {
	//	fail("Not yet implemented");
		try {
			fd.setfDoorState(true);
			fd.setOpenable(false);				//even true wouldnt make difference
			assertEquals(true, fd.fDoorOpen());
		} catch (OpenException e) {
			
			System.out.println("Door is already open at floor "+fd.floorNo);
		}
	}

	@Test
	public void testFDoorCloseValid() {
	//	fail("Not yet implemented");
		
		try {
			fd.setfDoorState(true);
			fd.setOpenable(false);
			assertEquals(true, fd.fDoorClose());
		}
		catch (CloseException e) {
			System.out.println("Door is already closed at floor  "+fd.floorNo);
		}
	}

	@Test
	public void testFDoorCloseInvalid() {
	//	fail("Not yet implemented");
		
		try {
			fd.setfDoorState(false);
			fd.setOpenable(false);
			assertEquals(true, fd.fDoorClose());
		}
		catch (CloseException e) {
			System.out.println("Door is already closed at floor "+fd.floorNo);
		}
	}
}
