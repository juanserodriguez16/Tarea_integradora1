package test;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Product;

public class ProductTest extends TestCase{

	Product pr;
	
	public void setUp() {
		String code = "1";
		String name = "gaseosa";
		String description = "bla bla bla";
		String nitRestaurant = "2353";
		int price = 2500;
		pr= new Product(code, name, description, nitRestaurant, price);
	}
	
	@Test
	public void price() {
		setUp();
		assertTrue(2500==pr.getPrice());
	}
}
