package Zuriel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class gitTestTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	@Test
	void testAdd() {
		gitTest objAdd = new gitTest();
		int expected =3;
		int actual=objAdd.add(1,2);
		assertEquals(expected,actual);
		
	}
	@Test
	void testMul() {
		gitTest objMul = new gitTest();
		int expected = 60;
		int actual=objMul.mul(3,4,5);
		assertEquals(expected,actual);
	}
	@Test
	void testDiv() {
		gitTest objDiv = new gitTest();
		int expected=3;
		int actual=objDiv.div(3,1);
		assertEquals(expected,actual);
	}
}
