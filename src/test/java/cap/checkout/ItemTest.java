package cap.checkout;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

/**
 * Tests to make sure the item equality is correct.
 * @author richhagu
 *
 */
public class ItemTest {
	
	@Test
	public void equalsContract() {
	    EqualsVerifier.forClass(Item.class).verify();
	}
}
