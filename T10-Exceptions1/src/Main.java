import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		//int numeroAleatorio = (int) (Math.random()*501);
		NumeroAleatorio numeroAleatorio = new NumeroAleatorio();
		numeroAleatorio.generarNumero();
		int intento = -1;
		int intentosTotales = 0;


		System.out.println("Adivina el número aleatorio: ");


		try {	
			while(intento != numeroAleatorio.getNumeroAleatorio()) {
				// System.out.println(numeroAleatorio.getNumeroAleatorio());
				intento = teclado.nextInt();
				intentosTotales++;

				if (intento > numeroAleatorio.getNumeroAleatorio()) {

					System.out.println("El numero aleatorio es mas pequeño");

				}

				else if (intento < numeroAleatorio.getNumeroAleatorio()) {

					System.out.println("El numero aleatorio es mas grande");

				}

			}
			System.out.println("Tardaste " + intentosTotales + " veces" );
		}

		catch(InputMismatchException e)
		{
			System.out.println("Debes poner un numero entero");
		}

	}

}
