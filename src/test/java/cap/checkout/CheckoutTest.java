package cap.checkout;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckoutTest {

	private Item apple = new Item("Apple", 0.6f);
	private Item orange = new Item("Orange", 0.25f);
	private Offer applesOffer = new Offer(apple, 2, 0.6f);
	private Offer orangesOffer = new Offer(orange, 3, 0.25f);
	private Checkout checkout;
	
	@Before
	public void setup(){
		checkout = new Checkout();
	}
	
	@Test
	public void testGetTotalNoOffer() {
		checkout.scanItem(apple);
		checkout.scanItem(apple);
		checkout.scanItem(orange);
		checkout.scanItem(apple);
		
		assertEquals(2.05f, checkout.getTotal(), 1);
	}
	
	@Test
	public void testGetTotalApplesOffer() {
		checkout.scanItem(apple);
		checkout.scanItem(apple);
		checkout.scanItem(orange);
		checkout.scanItem(apple);
		
		assertEquals(1.45f, checkout.getTotal(applesOffer, orangesOffer), 1);
	}
	
	@Test
	public void testGetTotalOrangesOffer() {
		checkout.scanItem(apple);
		checkout.scanItem(orange);
		checkout.scanItem(orange);
		checkout.scanItem(apple);
		
		assertEquals(1.80f, checkout.getTotal(applesOffer, orangesOffer), 1);
	}
	
	@Test
	public void testGetTotalBoth() {
		checkout.scanItem(apple);
		checkout.scanItem(orange);
		checkout.scanItem(orange);
		checkout.scanItem(apple);
		checkout.scanItem(apple);
		
		assertEquals(1.20f, checkout.getTotal(applesOffer, orangesOffer), 1);
	}
}
