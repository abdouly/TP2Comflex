package exceptions;
public class InsufficientBalanceException extends Exception {    
    private String account;    
    public InsufficientBalanceException( String account ) {
        super();
        this.account = account;
    }    
    public String getMessage() {
        return "The account "+account+" is not sufficiently balanced.";
    }
}
