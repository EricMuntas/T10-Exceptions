
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Password con = new Password(18);

		String contrasenia = con.generarPassword();


		System.out.println(contrasenia);


		System.out.println(con.esFuerte(contrasenia));


		// Crea un array de Password con el ta,año que tu le indiques por teclado.


		Password arrayPassword[] = new Password[3];

		arrayPassword[0] = new Password(20);
		String contra1 = arrayPassword[0].generarPassword();

		arrayPassword[1] = new Password(10);
		String contra2 = arrayPassword[1].generarPassword();

		arrayPassword[2] = new Password(12);
		String contra3 = arrayPassword[2].generarPassword();

		
		
		// Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte.
		boolean passwordsFuertes[] = new boolean[3];

		if (arrayPassword[0].esFuerte(contra1) == true) {

			passwordsFuertes[0] = true;

		}
		if (arrayPassword[1].esFuerte(contra2) == true) {
			
			passwordsFuertes[1] = true;
			
		}

		if (arrayPassword[2].esFuerte(contra3) == true) {
			
			passwordsFuertes[2] = true;
			
		}
		
		for (int i = 0; i < passwordsFuertes.length; i++) {
			
			System.out.println(arrayPassword[i] + " = " + passwordsFuertes[i]);
			
			
		}

	}

}
