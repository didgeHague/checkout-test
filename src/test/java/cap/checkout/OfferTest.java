package cap.checkout;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class OfferTest {

	@Test
	public void equalsContract() {
	    EqualsVerifier.forClass(Offer.class).verify();
	}
}
