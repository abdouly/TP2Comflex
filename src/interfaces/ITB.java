package interfaces;

import exceptions.InsufficientBalanceException;
import exceptions.UnknownAccountException;

public interface ITB {

	public void transfert(String from, String to, double amount)
			throws InsufficientBalanceException, UnknownAccountException;

}