import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad ;

		Scanner teclado = new Scanner(System.in);

		try {

			System.out.println("Cuantos anyos tienes?");
			edad = teclado.nextInt();

			throw new CustomExceptions(10);

		}

		catch (CustomExceptions e) {

			System.out.print(e.getMessage());

		}
		
		catch(InputMismatchException e) {
			System.out.println("Error! Debes escribir numero.");
		}

		finally {

			System.out.println();
			System.out.println("Programa terminado");

		}
	}
}
