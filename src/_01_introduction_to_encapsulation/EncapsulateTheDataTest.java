package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EncapsulateTheDataTest {
	
	@Test
	public void test() {
		
		EncapsulateTheData eta = new EncapsulateTheData();
		
		
		eta.set_itemsReceived(-5);
		assertEquals(0, eta.get_itemsReceived());
		
		eta.set_degreesTurned(-5);
		assertEquals(0.0, eta.get_degreesTurned(), 1);
		
		
		eta.set_nomenclature("");
		assertEquals(" ", eta.get_nomenclature());
		
		eta.set_memberObj(19);
		assertEquals(19, eta.get_memberObj());
		
		
	}
	
}
