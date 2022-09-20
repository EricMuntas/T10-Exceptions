import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroAleat = -1;

		try {
			Random numero = new Random();
			numeroAleat = numero.nextInt(999);
			System.out.println(numeroAleat);

			if (numeroAleat % 2 == 0) {

				throw new Exception("El numero aleatorio (" + numeroAleat + ") es PAR");

			} else {
				throw new Exception("El numero aleatorio (" + numeroAleat + ") es IMPAR");
			}

		}

		catch(Exception e) {

			System.out.println(e.getMessage());


		}




	}



}
