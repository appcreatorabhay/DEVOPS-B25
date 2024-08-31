package calcpkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {
	MyCalc obj = new MyCalc();
	
	

	@Test
	public void test() {

		assertEquals(30, obj.sum(20,10));
		assertEquals(10, obj.diff(20,10));

	}

}
