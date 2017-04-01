package exceptions;
public class UnknownItemException extends Exception {
    private Object item;
    public UnknownItemException( String msg ) {
        super(msg);
    }    
    public String getMessage() {
        return "Item "+item+" is not an item delivered by this provider.";
    }
}