package exceptions;
public class UnknownAccountException extends Exception {
    private String account;    
    public UnknownAccountException( String account ) {
        super();
        this.account = account;
    }    
    public String getMessage() {
        return "The account "+account+" is unknown.";
    }
}