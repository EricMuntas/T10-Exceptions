
public class Calculadora {

	public double suma(double numeroUno, double numeroDos) {

		double suma = numeroUno + numeroDos;

		return suma;	
	}

	public double resta(double numeroUno, double numeroDos) {

		double resta = numeroUno - numeroDos;

		return resta;	
	}


	public double multiplicacion(double numeroUno, double numeroDos) {

		double multiplicacion = numeroUno * numeroDos;

		return multiplicacion;	
	}

	public double potencia(double numeroUno, double numeroDos) {

		double potencia = Math.pow(numeroUno, numeroDos);
				
		return potencia;	
	}
	
	public double raizCuadrada(double numeroUno) {

		double raizCuadrada = Math.sqrt(numeroUno);
				
		return raizCuadrada;	
	}

	public double raizCubica(double numeroUno) {

		double raizCubica = Math.cbrt(numeroUno);
				
		return raizCubica;	
	}
	
	public double division(double numeroUno, double numeroDos) {

		double division = numeroUno / numeroDos;

		return division;	
	}
}



