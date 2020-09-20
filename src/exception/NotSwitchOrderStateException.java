package exception;

public class NotSwitchOrderStateException extends Exception{

	public NotSwitchOrderStateException() {
		super("Cambio de estado no permitido");
	}
}