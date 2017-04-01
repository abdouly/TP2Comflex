package interfaces;

import exceptions.UnknownItemException;

public interface IInfosProvider {

	/**
	 * Get the price of an item provided by this provider.
	 * 
	 * @param item
	 * @return
	 */
	public double getPrice(Object item) throws UnknownItemException;

}