import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora calculo = new Calculadora();

		Scanner teclado = new Scanner(System.in);

		int menu = 0;
		double numeroUno = 0;
		double numeroDos = 0;
		/*
		System.out.println("Escribe un número!(1)");
		double numeroUno = teclado.nextDouble();

		System.out.println("Escribe un número!(2)");
		double numeroDos = teclado.nextDouble();
		 */

		try {

			do {

				System.out.println("Que operaciones quieres hacer?(1-Suma, 2-Resta, 3-Multiplicacion, 4-Potencia, 5-Raíz Cuadrada, 6-Raíz Cúbica, 7-Division)");
				menu = teclado.nextInt();

				if ((menu >= 1 && menu <= 4) || menu == 7) {
					System.out.println("Escribe un número!(1)");
					numeroUno = teclado.nextDouble();

					System.out.println("Escribe un número!(2)");
					numeroDos = teclado.nextDouble();

					mostrarResultado(numeroUno, numeroDos, menu, calculo);
				}
				else {
					System.out.println("Escribe un número!(1)");
					numeroUno = teclado.nextDouble();
				}



			}while(!(menu > 0 && menu < 8));

		}
		catch(InputMismatchException e) {
			System.out.println("Error!");
		}

		teclado.close();

	}

	public static void mostrarResultado(double numeroUno, double numeroDos, int menu, Calculadora calculo) {


		if(menu == 1) {
			System.out.println("El resultado de la suma es: " + calculo.suma(numeroUno, numeroDos));
		}
		else if(menu == 2) {
			System.out.println("El resultado de la resta es: " + calculo.resta(numeroUno, numeroDos));
		}
		else if(menu == 3) {
			System.out.println("El resultado de la multiplicacion es: " + calculo.multiplicacion(numeroUno, numeroDos));
		}
		else if(menu == 4) {
			System.out.println("El resultado de la potencia es: " + calculo.potencia(numeroUno, numeroDos));
		}
		else if(menu == 5) {
			System.out.println("El resultado de la raiz cuadrada es: " + calculo.raizCuadrada(numeroUno));
		}
		else if(menu == 6) {
			System.out.println("El resultado de la raiz cubica es: " + calculo.raizCubica(numeroUno));
		}
		else if(menu == 7) {
			System.out.println("El resultado de la division es: " + calculo.division(numeroUno, numeroDos));
		}





	}



}
