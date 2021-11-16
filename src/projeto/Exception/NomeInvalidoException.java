package projeto.Exception;

@SuppressWarnings("serial")
public class NomeInvalidoException extends Exception {
	
	public String getMessage() {
		return "Nome Invalido";
	}
}
