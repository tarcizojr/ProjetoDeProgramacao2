package projeto.Exception;

public class DataInvalidaException extends Exception {
	private String data;

	public String getMessage() {
		return "Data Invalida";
	}
	

}
