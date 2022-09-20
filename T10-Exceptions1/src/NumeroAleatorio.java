
public class NumeroAleatorio {

	private int numeroAleatorio;

	public NumeroAleatorio() {
		super();
	}
	
	public int generarNumero() {
		
		numeroAleatorio = (int) (Math.random()*501);
		return numeroAleatorio;
		
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	
	
	
	
	
}
