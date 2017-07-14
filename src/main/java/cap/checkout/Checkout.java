package cap.checkout;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides functionality for scanning items and calculating the total
 * amount for the shop. 
 * @author richhagu
 *
 */
public class Checkout {
	
	private final List<Item> items = new ArrayList<>();
	
	/**
	 * Adds the item to the list of all items scanned.
	 * @param item {@link Item}
	 */
	public void scanItem(final Item item){
		items.add(item);
	}
	
	/**
	 * Calculates the total price for all the scanned items.
	 * @return float
	 */
	public float getTotal(Offer... offers){
		Float total = items.stream().map(Item::getPrice).reduce(0f, (a, b) -> a + b);
		
		if(offers != null){
			for (Offer offer : offers) {
				long count = items.stream().filter(item -> item.equals(offer.getItem())).count();
				int threshold = offer.getThreshold();
				long numReductions = count >= threshold ? Math.floorMod(count, threshold) : 0;
				total -= numReductions * offer.getReduction();
			}
		}
		return total;
	}
}
