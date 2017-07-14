package cap.checkout;

/**
 * Holds data for an {@link Item} offer.
 * @author richhagu
 *
 */
public final class Offer {
	
	private final Item item;
	private final int threshold;
	private final float reduction;
	
	public Offer(final Item item, final int threshold, final float reduction) {
		this.item = item;
		this.threshold = threshold;
		this.reduction = reduction;
	}

	public Item getItem() {
		return item;
	}

	public int getThreshold() {
		return threshold;
	}

	public float getReduction() {
		return reduction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + Float.floatToIntBits(reduction);
		result = prime * result + threshold;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Offer other = (Offer) obj;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (Float.floatToIntBits(reduction) != Float.floatToIntBits(other.reduction))
			return false;
		if (threshold != other.threshold)
			return false;
		return true;
	}
}
