package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Restaurant;

class RestauranTest {

	private Restaurant res;
	
	public void setUp() {
		String a = "MacDonals";
		String b = "12445";
		String c = "Manuel";
		res = new Restaurant(a, b, c);
	}
	
	@Test
	public void test1() {
		setUp();
		assertEquals("MacDonals", res.getName());
	}
	
	@Test
	public void test2() {
		setUp();
		assertNotNull(res);
		
	}

}
