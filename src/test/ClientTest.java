package test;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import model.Client;

public class ClientTest  extends TestCase{

	private Client client;
	
	@Test
	public void setUpEscenario1() {
		String a = "cc";
		String b = "111";
		String c = "Juan Manuel";
		String d = "Reyes";
		int e = 6354;
		String f = "calle siempre vivia";
		client = new Client(a,b , c, d, e, f);
	}
	public void test1() {
		setUpEscenario1();
		assertEquals("Reyes", client.getLastName());	
	}
	
	public void test2() {
		setUpEscenario1();
		boolean x = false;
		if (client != null) {
			x = true;
		}
		assertTrue(x);
	}
	

	
	
}
