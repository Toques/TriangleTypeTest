import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeStructuralTest {

	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void firstNegativeSideTest() {
		assertEquals(4, TriangleType.triangleType(-1, 3, 4));
	}
	
	@Test
	public void secondNegativeSideTest() {
		assertEquals(4, TriangleType.triangleType(1, -3, 4));
	}
	@Test
	public void thirdNegativeSideTest() {
		assertEquals(4, TriangleType.triangleType(1, 3, -4));
	}
	@Test
	public void firstvSideOver1000Test() {
		assertEquals(5, TriangleType.triangleType(1001, 700, 400));
	}
	@Test
	public void secondSideOver1000Test() {
		assertEquals(5, TriangleType.triangleType(1000, 1100, 400));
	}
	@Test
	public void thirdSideOver1000Test() {
		assertEquals(5, TriangleType.triangleType(1000, 800, 1500));
	}
	
	@Test
	public void constructorTest(){
		TriangleType tt = new TriangleType();
		assertEquals(1, tt.triangleType(1000, 900, 600));
	}
	
	@Test
	public void firstSideGreaterInvalidScaleneTest() {
		assertEquals(4, TriangleType.triangleType(1000, 50, 60));
	}
	
	@Test
	public void secondSideGreaterInvalidScaleneTest() {
		assertEquals(4, TriangleType.triangleType(50, 1000, 60));
	}
	
	@Test
	public void thirdSideGreaterInvalidScaleneTest() {
		assertEquals(4, TriangleType.triangleType(60, 50, 1000));
	}
	
	@Test
	public void isocelesSecondGreaterSideInvalidTest() {
		assertEquals(4, TriangleType.triangleType(400, 800, 400));
	}
	@Test
	public void isocelesFirstSideGreaterInvalidTest() {
		assertEquals(4, TriangleType.triangleType(800, 400, 400));
	}
	
	@Test
	public void isocelesSecondSideSmallerValidTest() {
		assertEquals(2, TriangleType.triangleType(400, 300, 400));
	}
	
	@Test
	public void isocelesFirstSideSmallerValidTest() {
		assertEquals(2, TriangleType.triangleType(300, 400, 400));
	}
}
