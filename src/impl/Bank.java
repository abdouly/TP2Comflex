package impl;
import interfaces.IAdmin;
import interfaces.IConsulter;
import interfaces.ITB;
import exceptions.InsufficientBalanceException;
import exceptions.UnknownAccountException;

public class Bank implements ITB {
	private IAdmin estore,anne,bob;
	
	public void initBob(IAdmin bob){
		this.bob = bob;
		this.bob.setOwner("Bob");
		this.bob.setAmount(100);
	}
	
	public void initEstore(IAdmin estore){
		this.estore = estore;
		this.estore.setOwner("Estore");
		this.estore.setAmount(0);
	}
	
	public void initAnne(IAdmin anne){
		this.anne = anne;
		this.anne.setOwner("Anne");
		this.anne.setAmount(30);
	}
	
	
     /* (non-Javadoc)
	 * @see impl.ITB#transfert(java.lang.String, java.lang.String, double)
	 */
    @Override
	public void transfert(String from, String to, double amount)
        throws InsufficientBalanceException, UnknownAccountException {
        IConsulter Afrom=null, Ato=null;        
        if (from.equals("E-Store")) Afrom = (IConsulter) estore;
        	if (from.equals("Anne")) Afrom = (IConsulter) anne;
        	if (from.equals("Bob")) Afrom = (IConsulter) bob;
        	if (to.equals("E-Store")) Ato = (IConsulter) estore;
        	if (to.equals("Anne")) Ato = (IConsulter) anne;
        	if (to.equals("Bob")) Ato = (IConsulter) bob;
            // Get the balance of the account to widthdraw
            double fromBalance = Afrom.getAmount();           
            // Check whether the account is sufficiently balanced
            if ( fromBalance < amount )
                throw new InsufficientBalanceException(from.toString());
            // Get the balance of the account to credit
            double toBalance = Ato.getAmount();           
            // Perform the transfert
            IAdmin AfromAd = (IAdmin) Afrom;
            IAdmin AtoAd = (IAdmin) Ato;
			AfromAd.setAmount( fromBalance - amount );
			AtoAd.setAmount( toBalance + amount );
    }    
 }
