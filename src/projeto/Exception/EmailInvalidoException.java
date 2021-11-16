package projeto.Exception;

@SuppressWarnings("serial")
public class EmailInvalidoException extends Exception {
	@Override
	public String getMessage() {
		return "Email Invalido" ;
	}

}
