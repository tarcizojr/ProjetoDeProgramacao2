package projeto.Exception;

@SuppressWarnings("serial")
public class SenhaInvalidaException extends Exception {
	public String getMessage() {
		return "Senha Invalida";
	}
}
