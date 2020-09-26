package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.ClientNoFoundException;
import model.Client;
import model.OrderSystem;

class OrderSystemTest {

	private OrderSystem os;

	public void setUp() {
		os = new OrderSystem();
		Client c1 = new Client("cc", "888", "Pepito", "Mendéz", 31046578, "Ingenio");
		Client c2 = new Client("cc", "555", "Juan", "Ramirez", 3156548, "Ciudad Jardin");
		Client c3 = new Client("cc", "333", "David", "Naranjo", 3116577, "Granada");
		Client c4 = new Client("cc", "444", "Monica", "Herrera", 3264868, "Peñon");
		os.addClient(c1);
		os.addClient(c2);
		os.addClient(c3);
		os.addClient(c4);
	}
	@Test
	public void test() {
		setUp();
		assertEquals("Monica",os.getClients().get(3).getName());
	}
	@Test
	public void test1() throws ClientNoFoundException {
		setUp();
		assertNotNull(os.searchClient("Juan"));
	}
	@Test
	public void test2() {
		setUp();
		assertTrue(4==os.getClients().size());
	}

	

}
