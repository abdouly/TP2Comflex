package interfaces;

import exceptions.InsufficientBalanceException;

public interface IOperationBancaire {

	public void credit(double amount);

	public void withdraw(double amount) throws InsufficientBalanceException;

}