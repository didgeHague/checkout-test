package cap.checkout;

/**
 * Holds data on a shop item.
 * @author richhagu
 *
 */
public class Item {
	
	private final String name;
	private final float price;
	
	public Item(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}
}
