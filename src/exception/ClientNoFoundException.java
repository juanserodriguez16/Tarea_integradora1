package exception;

public class ClientNoFoundException extends Exception{

	public ClientNoFoundException(String name) {
		super("El cliente "+ name +" no fue hallado, por favor intente de nuevo.");
	}
}
