package exception;

public class OrderVerificationException extends Exception{

	public OrderVerificationException(String product, String restaurant) {
		super("El producto " + product + " no pertence al restaurante " + restaurant);
	}
}
