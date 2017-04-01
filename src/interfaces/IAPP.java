package interfaces;

import impl.Client;
import datatypes.Cart;
import datatypes.Order;
import exceptions.InsufficientBalanceException;
import exceptions.InvalidCartException;
import exceptions.UnknownAccountException;
import exceptions.UnknownItemException;

public interface IAPP {

	/**
	 * Add an item to a cart.
	 * If the cart does not exist yet, create a new one.
	 * This method is called for each item one wants to add to the cart.
	 * 
	 * @param cart    a previously created cart or null
	 * @param client
	 * @param item
	 * @param qty
	 * @return
	 *      Implementation dependant.
	 *      Either a new cart at each call or the same cart updated.
	 * 
	 * @throws UnknownItemException
	 * @throws MismatchClientCartException
	 *      if the given client does not own the given cart
	 */
	public Cart addItemToCart(Cart cart, Client client, Object item, int qty)
			throws UnknownItemException, InvalidCartException;

	/**
	 * Once all the items have been added to the cart,
	 * this method finish make the payment
	 *  
	 * @param cart
	 * @param address
	 * @param bankAccountRef
	 * @return  the order
	 * 
	 * @throws UnknownItemException
	 */
	public Order pay(Cart cart, String address, String bankAccountRef)
			throws InvalidCartException, UnknownItemException,
			InsufficientBalanceException, UnknownAccountException;

}