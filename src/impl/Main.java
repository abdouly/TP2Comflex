package impl;


public class Main {
	public static void main (String [] args) {
		Account estore,anne,bob;
		estore = new Account();
		anne = new Account();
		bob = new Account();
		Bank bank = new Bank();
		bank.initEstore(estore);
		bank.initAnne(anne);
		bank.initBob(bob);
		Store store = new Store();
		Provider prov = new Provider();
		Client cl = new Client();
		store.initBank(bank);
		store.initICommande(prov);
		store.initIInfosProvider(prov);
		cl.initStoreIAF(store);
		cl.initStoreIAPP(store);
		cl.run();
    }
}
