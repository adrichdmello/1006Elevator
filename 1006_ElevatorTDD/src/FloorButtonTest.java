import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorButtonTest {

	FloorButton fb;
	FloorPanel fPanel;
	Building b;
	Floor f;
	Elevator e;
	
	@Before
	public void setUp() throws Exception {
		b= new Building(3);
		f = new Floor(2);
		fPanel = new FloorPanel(2, f);
		fb = new FloorButton("up");
	}

	@Test
	public void testFloorButton() {
	//	fail("Not yet implemented");
	}

	@Test
	public void testIsPressed() {
		//fail("Not yet implemented");
	}

	@Test
	public void testSetPressed() {
		//fail("Not yet implemented");
	}

	@Test
	public void testFloorButtonPressed() {
		//fail("Not yet implemented");
	//	fb.setPressed(true);
		//assertEquals(true,fb.FloorButtonPressed());
	}

}
