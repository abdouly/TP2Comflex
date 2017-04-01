package interfaces;

import exceptions.UnknownItemException;

public interface ICommande {

	/**
	 * Emit an order for items.
	 * The provider returns the delay for delivering the items.
	 * 
	 * @param store  the store that emits the order
	 * @param item   the item ordered
	 * @param qty    the quantity ordered
	 * @return       the delay (in hours)
	 */
	public int order(IInfos store, Object item, int qty)
			throws UnknownItemException;

}