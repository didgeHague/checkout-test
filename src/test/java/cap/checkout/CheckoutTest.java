package cap.checkout;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {
	
	private Checkout checkout;
	
	@Before
	public void setup(){
		checkout = new Checkout();
	}
	
	@Test
	public void testGetTotal() {
		Item apple = new Item("Apple", 0.6f);
		Item orange = new Item("Orange", 0.25f);
		
		checkout.scanItem(apple);
		checkout.scanItem(apple);
		checkout.scanItem(orange);
		checkout.scanItem(apple);
		
		assertEquals(2.05f, checkout.getTotal(), 1);
	}
}
