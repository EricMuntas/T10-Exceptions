
public class CustomExceptions extends Exception{

	private int codigoException;

	public CustomExceptions(int codigoException) {

		this.codigoException = codigoException;

	}


	public String getMessage() {

		String mensaje = "";

		if (codigoException >= 18) {

			mensaje = "Mayor de edad";

		} 
		else {

			mensaje = "Menor de edad";

		}

		return mensaje;
	}

}
