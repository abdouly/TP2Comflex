package interfaces;

import exceptions.UnknownItemException;

public interface IInfos {

	/**
	 * @param item  a given item
	 * @return      the price of a given item
	 * @throws UnknownItemException
	 */
	public double getPrice(Object item) throws UnknownItemException;

	/**
	 * @param item  a given item
	 * @param qty   a given quantity
	 * @return
	 *      true if the given quantity of the given item is available
	 *      directly from the store
	 *      i.e. without having to re-order it from the provider
	 */
	public boolean isAvailable(Object item, int qty)
			throws UnknownItemException;

}