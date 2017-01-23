import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeFunctionalTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void threeUniqueLengthsTest() {
		
		assertEquals(3,TriangleType.triangleType(10,10,10));
	}
	
	@Test
	public void threeUniqueLengthsGreaterThan1000Test() {
		
		assertEquals(5,TriangleType.triangleType(1001,1001,1001));
	}

	@Test
	public void twoUniqueLengthsTest() {
		
		assertEquals(2,TriangleType.triangleType(15,15,25));
	}
	
	@Test
	public void twoUniqueLengthsViolateTriangleInequalityTest() {
		
		assertEquals(4,TriangleType.triangleType(10,10,30));
	}
	
	@Test
	public void twoUniqueLengthsGreaterThan1000Test() {

		assertEquals(5,TriangleType.triangleType(1001,1002,1001));
	}
	
	@Test
	public void oneUniqueLengthTest() {
		
		assertEquals(1,TriangleType.triangleType(10,30,35));
	}
	
	@Test
	public void oneUniqueLengthViolateTriangleInequalityTest() {
		
		assertEquals(4,TriangleType.triangleType(10,20,40));
	}
	
	@Test
	public void oneUniqueLengthGreaterThan1000Test() {
		
		assertEquals(5,TriangleType.triangleType(1001,1002,1003));
	}
}
